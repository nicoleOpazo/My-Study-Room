package com.team7.mystudyroom.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Register")
public class Register {
    @Id
    @GeneratedValue
    private Integer register_id;

    private String name;
    private String username;
    private String email;
    private String password;

    


    public Register() {
    }

    public Register(Integer register_id, String name, String username, String email, String password) {
        this.register_id = register_id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }


    public Integer getRegister_id() {
        return register_id;
    }
    public void setRegister_id(Integer register_id) {
        this.register_id = register_id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    
}
