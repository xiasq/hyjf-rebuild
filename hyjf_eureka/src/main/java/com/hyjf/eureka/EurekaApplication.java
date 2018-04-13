package com.hyjf.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//开启eureka服务
@EnableEurekaServer
// springBoot注解,spring在springBoot基础之上来构建项目
@SpringBootApplication
public class EurekaApplication {
	// spirng boot的标准入口
	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaApplication.class).web(true).run(args);
	}

}
