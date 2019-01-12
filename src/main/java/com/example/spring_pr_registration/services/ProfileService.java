package com.example.spring_pr_registration.services;

import com.example.spring_pr_registration.dao.ProfileDAO;
import com.example.spring_pr_registration.models.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ProfileService {

    @Autowired
    private ProfileDAO profileDAO;

    public void save(String name, String surname){
        profileDAO.save(new Profile(name,surname));
    }

    public void save(Profile profile){
        profileDAO.save(profile);
    }


}
