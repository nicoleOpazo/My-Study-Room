package com.team7.mystudyroom.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "UserType")
public class UserType {
    @Id
    @GeneratedValue
    private Integer user_type_id;

    private String user_type_name;

    //Relación 1 a 1 UserType con Admin (da)
 /*    @OneToOne(mappedBy = "userType", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Admin admin; */

    @OneToMany(mappedBy = "userType", cascade = CascadeType.ALL)
    private List<Admin> admin;

    //Relación 1 a 1 UserType con User (da)
    @OneToOne(mappedBy = "userType", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private User user;

    



    public UserType() {
    }





    public UserType(Integer user_type_id, String user_type_name, List<Admin> admin, User user) {
        this.user_type_id = user_type_id;
        this.user_type_name = user_type_name;
        this.admin = admin;
        this.user = user;
    }





    public Integer getUser_type_id() {
        return user_type_id;
    }





    public void setUser_type_id(Integer user_type_id) {
        this.user_type_id = user_type_id;
    }





    public String getUser_type_name() {
        return user_type_name;
    }





    public void setUser_type_name(String user_type_name) {
        this.user_type_name = user_type_name;
    }





    public List<Admin> getAdmin() {
        return admin;
    }





    public void setAdmin(List<Admin> admin) {
        this.admin = admin;
    }





    public User getUser() {
        return user;
    }





    public void setUser(User user) {
        this.user = user;
    }



}
