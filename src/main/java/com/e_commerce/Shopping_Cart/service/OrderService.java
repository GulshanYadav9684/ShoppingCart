package com.e_commerce.Shopping_Cart.service;
import com.e_commerce.Shopping_Cart.model.OrderRequest;
import com.e_commerce.Shopping_Cart.model.ProductOrder;

import java.util.List;

//import com.ecom.model.OrderRequest;
//import com.ecom.model.ProductOrder;

public interface OrderService {

    public void saveOrder(Integer userid, OrderRequest orderRequest) throws Exception;

    public List<ProductOrder> getOrdersByUser(Integer userId);

    public ProductOrder updateOrderStatus(Integer id, String status);

    public List<ProductOrder> getAllOrders();
}