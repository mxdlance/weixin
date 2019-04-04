package com.gdkm.weixin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.gdkm.weixin.domain.InMessage;

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
		return template;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		//111
	}

}
