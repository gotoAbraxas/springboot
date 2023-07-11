package com.example.demo;

import com.example.demo.member.MemberRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
		String[] beanDefinitionNames = run.getBeanDefinitionNames();
		new MemberRequest("aa", 21);
	}
}
