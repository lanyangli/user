package com.liulang.user.service;

import com.liulang.user.entity.User;

public interface IUserService {
	public User findUserById(Integer userId);
	public void addUser(User user);
}
