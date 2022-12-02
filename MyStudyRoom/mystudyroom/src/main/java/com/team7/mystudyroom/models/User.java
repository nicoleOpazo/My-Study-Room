package com.team7.mystudyroom.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity(name = "User")
public class User {
    @Id
    @GeneratedValue
    private Integer user_id;

    //Relación 1 a 1 User con UserType (recibe)
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_type_id")
    private UserType userType;

        //Relación 1 a muchos User con Register (recibe)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="register_id")
    private Register register;

    //One to many EAGER entrega. Y el que entrega queda con la lista
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List <Settings> settings;
    


    public User() {
    }

    public User(Integer user_id, UserType userType, Register register, List<Settings> settings) {
        this.user_id = user_id;
        this.userType = userType;
        this.register = register;
        this.settings = settings;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public Register getRegister() {
        return register;
    }

    public void setRegister(Register register) {
        this.register = register;
    }

    public List<Settings> getSettings() {
        return settings;
    }

    public void setSettings(List<Settings> settings) {
        this.settings = settings;
    }

    
    
}
