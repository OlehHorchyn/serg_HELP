package com.example.spring_pr_registration.controllers;

import com.example.spring_pr_registration.models.Profile;
import com.example.spring_pr_registration.models.User;
import com.example.spring_pr_registration.services.EmailService;
import com.example.spring_pr_registration.services.ProfileService;
import com.example.spring_pr_registration.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.URL;

@Controller

public class MainController {

    @Autowired
    private UserService userService;

    @Autowired
    private ProfileService profileService;
    
    @GetMapping("/")    
    public String home(){

        return "home";
    }
    
    @GetMapping("/signUpPage")
    public String signInPage(){
        return "signUpPage";
    }



    @Autowired
    private EmailService emailService;

    @GetMapping("/signUp")
    public String signUp(
            @RequestParam String name,
            @RequestParam String surname,
            @RequestParam String username,
            @RequestParam String email,
            @RequestParam String password
    ){

        Profile profile = new Profile(name, surname);
        User user = new User(username, email, password);
        userService.save(user);
        profile.setUser(user);
        profileService.save(profile);

        emailService.sendEmail(email);
        return "/home";
    }


}