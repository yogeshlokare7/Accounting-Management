package com.mjb.accounting.service;

import com.mjb.accounting.model.User;

public interface UserService {
	 public void save(User user);
	 public User findByUsername(String username);
	 public Iterable<User> findAll();
}
