package com.easy_pick.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easy_pick.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	public User findByEmail(String username);

}
