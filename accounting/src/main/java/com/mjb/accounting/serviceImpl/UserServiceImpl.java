package com.mjb.accounting.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjb.accounting.model.User;
import com.mjb.accounting.repository.UserRepository;
import com.mjb.accounting.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	@Override
	public void save(User user) {
		userRepository.save(user);
	}

	@Override
	public User findByUsername(String username) {
		 return null;
	}

	@Override
	public Iterable<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
