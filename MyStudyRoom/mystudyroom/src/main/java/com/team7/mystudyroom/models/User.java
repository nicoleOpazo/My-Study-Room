package com.team7.mystudyroom.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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

    
}
