package com.easy_pick.repository;

import com.easy_pick.model.Cart;
import com.easy_pick.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import com.easy_pick.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


    CartItem findByCartAndProductAndSize(Cart cart, Product product, String size);


}
