package com.example.spring_pr_registration.dao;

import com.example.spring_pr_registration.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Integer> {
    //crud
}
