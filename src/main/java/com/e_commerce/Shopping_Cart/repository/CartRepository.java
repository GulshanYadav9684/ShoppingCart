package com.e_commerce.Shopping_Cart.repository;

import com.e_commerce.Shopping_Cart.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CartRepository extends JpaRepository<Cart, Integer> {

    public Cart findByProductIdAndUserId(Integer productId, Integer userId);

}