package com.example.spring_pr_registration.models;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@ToString(exclude = {"user"})

public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private User user;


    public Profile() {
    }

    public Profile(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
