package com.gdkm.weixin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.gdkm.weixin.domain.InMessage;
import com.gdkm.weixin.service.JsonRedisSerializer;

@SpringBootApplication
public class Application {

	
	@Bean
	public XmlMapper xmlMapper() {

		XmlMapper mapper=new XmlMapper();
		return mapper;
	}
	
	
	@Bean
	//方法注入
	public RedisTemplate<String,? extends InMessage> inMessageTemplate(@Autowired RedisConnectionFactory connectionFactory){
		RedisTemplate<String,? extends InMessage> template =new RedisTemplate<>();
		template.setConnectionFactory(connectionFactory);
		// 使用序列化程序完成对象的序列化和反序列化，可以自定义
		template.setValueSerializer(new JsonRedisSerializer<InMessage>(null));

		return template;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		//111
	}

}
