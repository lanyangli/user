package com.liulang.user.service.impl;


import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.liulang.user.entity.User;
import com.liulang.user.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
	@Override
	public User findUserById(Integer userId) {
		System.out.println("=====>>>>currentProxy="+AopContext.currentProxy());
		return null;
	}
	
	
	@Override
	public void addUser(User user) {

	}
	public void test() {
	}
	@Transactional(rollbackFor=RuntimeException.class)
	public void inner() throws Exception{
		throw new Exception("inner ");
	}

}
