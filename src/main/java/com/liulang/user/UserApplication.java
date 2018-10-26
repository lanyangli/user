package com.liulang.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.EnableAspectJAutoProxy;



@SpringBootApplication
//@EnableEurekaClient
@EnableAspectJAutoProxy(exposeProxy=true)
@EnableAutoConfiguration
@EnableConfigurationProperties
public class UserApplication {
	public static void main(String[] args) {
		
		SpringApplication.run(UserApplication.class, args);
	}
}
