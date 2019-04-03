package com.gdkm.weixin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

@SpringBootApplication
public class Application {

	
	@Bean
	public XmlMapper xmlMapper() {

		XmlMapper mapper=new XmlMapper();
		return mapper;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		//111
	}

}
