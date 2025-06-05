package com.easy_pick.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.easy_pick.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
