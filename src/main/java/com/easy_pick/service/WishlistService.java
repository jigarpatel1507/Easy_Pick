package com.easy_pick.service;


import com.easy_pick.exception.WishlistNotFoundException;
import com.easy_pick.model.Product;
import com.easy_pick.model.User;
import com.easy_pick.model.Wishlist;

public interface WishlistService {

    Wishlist createWishlist(User user);

    Wishlist getWishlistByUserId(User user);

    Wishlist addProductToWishlist(User user, Product product) throws WishlistNotFoundException;

}

