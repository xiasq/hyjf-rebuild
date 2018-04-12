package com.hyjf.cs.iam.mq;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import com.hyjf.common.exception.MQException;
import org.springframework.stereotype.Component;

/**
 * @author xiasq
 * @version CouponProducer, v0.1 2018/4/12 11:11
 */
@Component
public class CouponProducer extends Producer {
	private static final Logger logger = LoggerFactory.getLogger(CouponProducer.class);

	@Value("${rocketMQ.group.couponGroup}")
	private String couponGroup;

	@Override
	protected ProducerFieldsWrapper getFieldsWrapper() {
		ProducerFieldsWrapper wrapper = new ProducerFieldsWrapper();
		wrapper.setGroup(couponGroup);
		wrapper.setInstanceName(String.valueOf(System.currentTimeMillis()));
		return wrapper;
	}

	@Override
	public boolean messageSend(MassageContent messageContent) throws MQException {
		return super.messageSend(messageContent);
	}
}
