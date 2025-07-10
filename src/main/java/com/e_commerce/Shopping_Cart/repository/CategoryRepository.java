package com.e_commerce.Shopping_Cart.repository;

import com.e_commerce.Shopping_Cart.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Integer> {
    Boolean existsByName(String name);

    List<Category> findByIsActiveTrue();
//    Boolean existCategory(String name);
}
