package com.example.projectspring.services;

import com.example.projectspring.entities.Category;
import com.example.projectspring.entities.Order;
import com.example.projectspring.repositories.CategoryRepository;
import com.example.projectspring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
