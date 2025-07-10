package com.e_commerce.Shopping_Cart.service;

import com.e_commerce.Shopping_Cart.model.Cart;

import java.util.List;

public interface CartService {
    public Cart saveCart(Integer productId, Integer userId);

    public List<Cart> getCartsByUser(Integer userId);
}
