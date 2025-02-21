package com.example.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {// User is the entity class and Integer is the type of
																// primary key
	// we inherit all the methods from JpaRepository
	// we can also define our own methods
	User findByEmailAndPassword(String email, String password);

}
