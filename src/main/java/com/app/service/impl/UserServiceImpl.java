package com.app.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Roles;
import com.app.model.User;
import com.app.repo.UserRepository;
import com.app.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository repo;
	
	public Integer saveUser(User user) {
		Integer id=repo.save(user).getId();
		return id;
	}

	@Transactional
	public List<User> getAllUsers() {
		return repo.findAll();
	}

	@Override
	@Transactional
	public User getUserById(Integer id) {
		return repo.getUserById(id);
	}
}