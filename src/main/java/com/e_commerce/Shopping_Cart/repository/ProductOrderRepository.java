package com.e_commerce.Shopping_Cart.repository;
import java.util.List;

import com.e_commerce.Shopping_Cart.model.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;

//import com.ecom.model.ProductOrder;

public interface ProductOrderRepository extends JpaRepository<ProductOrder, Integer> {

    List<ProductOrder> findByUserId(Integer userId);

    ProductOrder findByOrderId(String orderId);
}