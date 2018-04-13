package com.hyjf.iam.datasouce;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * @author xiasq
 * @version DruidDataSourceConfig, v0.1 2018/1/21 22:32
 */

@Configuration
@MapperScan("iam.hyjf.iam.dao")
public class DruidDataSourceConfig {

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource druidDataSource() {
		DataSource druidDataSource = new DruidDataSource();
		return druidDataSource;
	}
}
