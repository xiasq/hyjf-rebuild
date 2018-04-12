package com.hyjf.mc.mq;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;

import com.alibaba.rocketmq.client.consumer.DefaultMQPushConsumer;
import com.alibaba.rocketmq.client.exception.MQClientException;

/**
 * @author xiasq
 * @version Consumer, v0.1 2018/4/12 14:55
 */
public abstract class Consumer {

    protected DefaultMQPushConsumer defaultMQPushConsumer;
    @Value("${rocketMQ.namesrvAddr}")
    private String namesrvAddr;

    @PostConstruct
    public void init() throws MQClientException {
        defaultMQPushConsumer = new DefaultMQPushConsumer();
        defaultMQPushConsumer.setInstanceName("MC");
        defaultMQPushConsumer.setNamesrvAddr(namesrvAddr);
        init(defaultMQPushConsumer);
    }

    public abstract void init(DefaultMQPushConsumer defaultMQPushConsumer) throws MQClientException;
}
