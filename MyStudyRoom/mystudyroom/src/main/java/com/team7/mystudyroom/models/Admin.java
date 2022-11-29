package com.team7.mystudyroom.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin {
    @Id
    @GeneratedValue
    private Integer admin_id;

    private String name;
    private String email;
    private String password;

    
}
