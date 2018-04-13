package com.hyjf.cs.iam.mq;

import com.alibaba.rocketmq.client.exception.MQBrokerException;
import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.client.producer.SendStatus;
import com.alibaba.rocketmq.common.message.Message;
import com.alibaba.rocketmq.remoting.exception.RemotingException;
import com.hyjf.iam.exception.MQException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import java.io.Serializable;

/**
 * @author xiasq
 * @version Producer, v0.1 2018/4/12 11:04
 */
public abstract class Producer {
	private static final Logger logger = LoggerFactory.getLogger(Producer.class);

	private DefaultMQProducer defaultMQProducer;

	@Value("${rocketMQ.namesrvAddr}")
	private String namesrvAddr;

	@Value("${rocketMQ.defaultProducerGroup}")
	private String producerGroup;

	@PostConstruct
	protected void init() throws MQClientException {
		defaultMQProducer = new DefaultMQProducer();
		defaultMQProducer.setNamesrvAddr(namesrvAddr);
		String group;
		ProducerFieldsWrapper fieldsWrapper = getFieldsWrapper();
		if (fieldsWrapper == null) {
			defaultMQProducer.setProducerGroup(producerGroup);
			defaultMQProducer.setInstanceName(String.valueOf(System.currentTimeMillis()));
			group = producerGroup;
		} else {
			defaultMQProducer.setProducerGroup(fieldsWrapper.getGroup());
			defaultMQProducer.setInstanceName(fieldsWrapper.getInstanceName());
			group = fieldsWrapper.getGroup();
		}
		defaultMQProducer.start();
		logger.info("Producer mq group {} init", group);
	}

	protected abstract ProducerFieldsWrapper getFieldsWrapper();

	protected boolean send(Message message)
			throws MQClientException, RemotingException, MQBrokerException, InterruptedException {
		logger.info("mq address--->{}", namesrvAddr);
		SendResult sendResult = defaultMQProducer.send(message);
		if (sendResult != null && sendResult.getSendStatus() == SendStatus.SEND_OK) {
			return true;
		} else {
			return false;
		}
	}

	protected boolean messageSend(MassageContent messageContent) throws MQException {
		try {
			Message message = new Message(messageContent.topic, messageContent.tag, messageContent.keys,
					messageContent.body);
			return send(message);
		} catch (MQClientException | RemotingException | MQBrokerException | InterruptedException e) {
			throw new MQException("dynamicCode mq messageSend error", e);
		}
	}

	protected DefaultMQProducer getDefaultMQProducer() throws MQClientException {
		return defaultMQProducer;
	}

	public static class MassageContent implements Serializable {
		private static final long serialVersionUID = -6846413929342308237L;
		public final String topic;
		public final String tag;
		public final String keys;
		public final byte[] body;

		public MassageContent(String topic, String tag, String keys, byte[] body) {
			this.topic = topic;
			this.tag = tag;
			this.keys = keys;
			this.body = body;
		}
	}

	protected static class ProducerFieldsWrapper {
		private String group;
		private String instanceName;

		public String getGroup() {
			return group;
		}

		public void setGroup(String group) {
			this.group = group;
		}

		public String getInstanceName() {
			return instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}
	}
}
