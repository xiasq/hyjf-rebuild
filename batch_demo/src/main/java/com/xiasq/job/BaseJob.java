package com.xiasq.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import com.xiasq.SpringLocator;

/**
 * @author xiasq
 * @version BaseJob, v0.1 2018/1/20 22:22
 */
public abstract class BaseJob {

	protected Logger logger = LoggerFactory.getLogger(getClass());

	protected RestTemplate restTemplate = SpringLocator.getBean(RestTemplate.class);
}
