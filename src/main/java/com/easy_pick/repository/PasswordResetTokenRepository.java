package com.easy_pick.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easy_pick.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
