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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="register_id")
    private Register register;

    //One to many EAGER entrega. Y el que entrega queda con la lista
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch= FetchType.EAGER)
    private List <Settings> settings;

    //Relación 1 a muchos User con Register (recibe)

    
}
