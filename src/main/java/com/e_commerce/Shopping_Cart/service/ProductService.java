package com.e_commerce.Shopping_Cart.service;

import java.util.List;

import com.e_commerce.Shopping_Cart.model.Product;
import org.springframework.web.multipart.MultipartFile;


public interface ProductService {

    public Product saveProduct(Product product);

    public List<Product> getAllProducts();

    public Boolean deleteProduct(Integer id);

    public Product getProductById(Integer id);

    public Product updateProduct(Product product, MultipartFile file);


    public List<Product> getAllActiveProducts(String category);

    List<Product> searchProduct(String ch);
}