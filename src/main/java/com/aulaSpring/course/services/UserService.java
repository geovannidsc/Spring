package com.aulaSpring.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulaSpring.course.entities.User;
import com.aulaSpring.course.repositories.userRepository;

@Service
public class UserService {

	@Autowired
	private userRepository repository;
	
	public List<User> findAll(){
		
		return repository.findAll();
	}
	
	
	public User findById(Long id) {
		
		Optional<User> obj = repository.findById(id);
		
		return obj.get();
	}
	
}
