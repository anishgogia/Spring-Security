package com.example.demo.service;

import com.example.demo.model.User;

public interface UserService  {
	User findByEmail(String username);
	void save(User user);
}
