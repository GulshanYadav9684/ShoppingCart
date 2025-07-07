package com.e_commerce.Shopping_Cart.service;

import com.e_commerce.Shopping_Cart.model.Category;

import java.util.List;

public interface CategoryService {

    public Category saveCategory(Category category);
    public Boolean existCategory(String name);
    public List<Category> getAllCategory();
}
