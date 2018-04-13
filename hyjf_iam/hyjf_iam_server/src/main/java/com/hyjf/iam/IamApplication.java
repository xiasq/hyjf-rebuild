package com.hyjf.iam;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author xiasq
 * @version IamApplication, v0.1 2018/1/21 22:09
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
@MapperScan(basePackages = { "com.hyjf.dao.mapper" }, sqlSessionFactoryRef = "sqlSessionFactory")
public class IamApplication {

	public static void main(String[] args) {
		SpringApplication.run(IamApplication.class, args);
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
