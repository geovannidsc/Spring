package com.aulaSpring.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulaSpring.course.entities.User;

@RestController
@RequestMapping(value ="/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Maria,","maria@gmail.com", "9999999","d5s4d5s");
		return ResponseEntity.ok().body(u);
	}
	
}
