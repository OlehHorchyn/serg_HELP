package com.example.spring_pr_registration.dao;

import com.example.spring_pr_registration.models.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileDAO extends JpaRepository<Profile, Integer> {
    //crud
}
