package com.hackathon3.api.entities;

import com.hackathon3.api.enums.RoleEnum;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;

    @OneToMany(mappedBy = "role")
    private RoleEnum role;
}
