package com.hyjf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xiasq
 * @version SpringCloudConfigApplication, v0.1 2018/2/2 9:44
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class SpringCloudConfigApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigApplication.class, args);
	}
}
