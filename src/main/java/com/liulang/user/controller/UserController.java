package com.liulang.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.liulang.user.entity.User;
import com.liulang.user.service.IUserService;
import com.liulang.user.service.impl.UserServiceImpl;


@RestController
@RequestMapping(value="/user")
public class UserController {
	Logger log = LoggerFactory.getLogger(UserController.class);
	@Autowired
	UserServiceImpl userService;
	@RequestMapping(value="/findUserById",method=RequestMethod.GET)
	public User findUserById() {
		System.out.println("=====>>>"+Thread.currentThread().getName());
		log.debug("---hello");
		try {
			userService.inner();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
