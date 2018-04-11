package com.hyjf.bi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author xiasq
 * @version BiApplication, v0.1 2018/1/26 11:50
 */

@SpringBootApplication
@EnableDiscoveryClient
public class BiApplication {
	/**
	 * 实例化RestTemplate，通过@LoadBalanced注解开启均衡负载能力.
	 *
	 * @return restTemplate
	 */
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(BiApplication.class, args);
	}

}
