package com.app.service;

import java.util.List;

import com.app.model.Roles;
import com.app.model.User;

public interface IUserService {

	public Integer saveUser(User user);
	public List<User> getAllUsers();
	public User getUserById(Integer id);
}