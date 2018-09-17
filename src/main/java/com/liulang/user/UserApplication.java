package com.liulang.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.EnableAspectJAutoProxy;



@SpringBootApplication
@EnableEurekaClient
@EnableAspectJAutoProxy(exposeProxy=true)
@EnableAutoConfiguration
public class UserApplication {
	public static void main(String[] args) {
		
		SpringApplication.run(UserApplication.class, args);
	}
}
