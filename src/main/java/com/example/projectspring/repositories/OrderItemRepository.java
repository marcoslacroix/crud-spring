package com.example.projectspring.repositories;

import com.example.projectspring.entities.OrderItem;
import com.example.projectspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
