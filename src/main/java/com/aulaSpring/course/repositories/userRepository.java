package com.aulaSpring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaSpring.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
