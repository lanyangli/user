package com.liulang.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * 服务注册中心
 * @author lanyangli
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class UserApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(UserApplication.class, args);
	}
}
