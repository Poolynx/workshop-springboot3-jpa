package com.wesley.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wesley.course.entities.User;

public interface UserReposity extends JpaRepository<User, Long> {
	
}
