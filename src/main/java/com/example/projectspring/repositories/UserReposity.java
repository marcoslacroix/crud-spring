package com.example.projectspring.repositories;

import com.example.projectspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposity extends JpaRepository<User, Long> {
}
