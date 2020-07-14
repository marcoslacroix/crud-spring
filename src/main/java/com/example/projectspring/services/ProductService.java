package com.example.projectspring.services;

import com.example.projectspring.entities.Product;
import com.example.projectspring.entities.User;
import com.example.projectspring.repositories.ProductRepository;
import com.example.projectspring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
