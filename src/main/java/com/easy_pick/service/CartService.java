package com.easy_pick.service;

import com.easy_pick.exception.ProductException;
import com.easy_pick.model.Cart;
import com.easy_pick.model.CartItem;
import com.easy_pick.model.Product;
import com.easy_pick.model.User;

public interface CartService {
	
	public CartItem addCartItem(User user,
								Product product,
								String size,
								int quantity) throws ProductException;
	
	public Cart findUserCart(User user);

}
