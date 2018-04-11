package com.xiasq;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author xiasq
 * @version BatchApplication, v0.1 2018/1/20 22:07
 */

@SpringBootApplication
public class BatchApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(BatchApplication.class).web(true).run(args);
	}

	/**
	 * 实例化RestTemplate，通过@LoadBalanced注解开启均衡负载能力.
	 * @return restTemplate
	 */
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
