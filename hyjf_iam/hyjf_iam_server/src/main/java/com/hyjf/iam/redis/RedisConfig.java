package com.hyjf.iam.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.serializer.support.DeserializingConverter;
import org.springframework.core.serializer.support.SerializingConverter;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import redis.clients.jedis.JedisPoolConfig;

/**
 * @author xiasq
 * @version RedisConfig, v0.1 2018/1/21 22:33
 */

@Configuration
@EnableAutoConfiguration
public class RedisConfig {

	private static final Logger logger = LoggerFactory.getLogger(RedisConfig.class);

	@Bean
	@ConfigurationProperties(prefix = "spring.redis.pool")
	public JedisPoolConfig getRedisConfig() {
		JedisPoolConfig config = new JedisPoolConfig();
		return config;
	}

	@Bean
	@ConfigurationProperties(prefix = "spring.redis")
	public JedisConnectionFactory getConnectionFactory() {
		JedisConnectionFactory factory = new JedisConnectionFactory();
		JedisPoolConfig config = getRedisConfig();
		factory.setPoolConfig(config);
		logger.info("JedisConnectionFactory bean init success.");
		return factory;
	}

	@Bean
	public RedisTemplate<String, Object> getRedisTemplate() {
		RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
		template.setConnectionFactory(getConnectionFactory());
		template.setKeySerializer(new StringRedisSerializer());
		template.setValueSerializer(new RedisObjectSerializer());
		return template;
	}

	public static class RedisObjectSerializer implements RedisSerializer<Object> {
		private Converter<Object, byte[]> serializer = new SerializingConverter();
		private Converter<byte[], Object> deserializer = new DeserializingConverter();
		public final static byte[] EMPTY_ARRAY = new byte[0];

		public Object deserialize(byte[] bytes) {
			if (isEmpty(bytes)) {
				return null;
			}
			try {
				return deserializer.convert(bytes);
			} catch (Exception ex) {
				throw new SerializationException("Cannot deserialize", ex);
			}
		}

		public byte[] serialize(Object object) {
			if (object == null) {
				return EMPTY_ARRAY;
			}
			try {
				return serializer.convert(object);
			} catch (Exception ex) {
				return EMPTY_ARRAY;
			}
		}

		private boolean isEmpty(byte[] data) {
			return (data == null || data.length == 0);
		}
	}
}
