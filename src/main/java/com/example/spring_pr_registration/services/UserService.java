package com.example.spring_pr_registration.services;

import com.example.spring_pr_registration.dao.UserDAO;
import com.example.spring_pr_registration.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService {
    @Autowired
    private UserDAO userDAO;

    public void save(String username ,String email, String password){
        userDAO.save(new User(username,email,password));
    }

    public void save(User user){
        userDAO.save(user);
    }


}
