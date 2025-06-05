package com.easy_pick.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easy_pick.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

	 Cart findByUserId(Long userId);
}
