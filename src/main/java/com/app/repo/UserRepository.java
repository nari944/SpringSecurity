package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User getUserById(Integer id);
	User findByUsername(String username);
}
