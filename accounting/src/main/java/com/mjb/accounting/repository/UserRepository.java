package com.mjb.accounting.repository;

import org.springframework.data.repository.CrudRepository;

import com.mjb.accounting.model.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface UserRepository extends CrudRepository<User, Long> {

	 //User findByUsername(String name);

}
