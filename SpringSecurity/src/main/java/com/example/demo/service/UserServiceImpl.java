package com.example.demo.service;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;

@Service
public class UserServiceImpl implements UserService{
	
	 @Autowired
	    private UserRepository userRepository;
	 BCryptPasswordEncoder bc =  new BCryptPasswordEncoder();
	    

	    @Override
	    public void save(User user) {
	        user.setPassword(bc.encode(user.getPassword()));
	       // user.setRoles(new HashSet<>(roleRepository.findAll()));
	        userRepository.save(user);
	    }
	@Override
	public User findByEmail(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUserId(username);
	}

}
