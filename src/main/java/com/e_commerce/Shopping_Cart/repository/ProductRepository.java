package com.e_commerce.Shopping_Cart.repository;

import com.e_commerce.Shopping_Cart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
    List<Product> findByIsActiveTrue();

    List<Product> findByCategory(String category);

    List<Product> findByTitleContainingIgnoreCaseOrCategoryContainingIgnoreCase(String ch, String ch1);

//    Product save(Product product);
//
//    List<Product> findAll();
//
//    Optional<Object> findById(Integer id);
//
//    void delete(Product product);
}
