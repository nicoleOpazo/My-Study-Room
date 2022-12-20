package com.team7.mystudyroom.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.team7.mystudyroom.models.Register;

public interface RegisterRepository extends JpaRepository <Register, Integer> {

    //name
    @Query(value ="select * from register where name = ?1", nativeQuery = true)
    List <Register> findAllName(String name);

    //username
    @Query(value ="select * from register where username = ?1", nativeQuery = true)
    List <Register> findAllUserName(String username);

    //email
    @Query(value ="select * from register where email = ?1", nativeQuery = true)
    List <Register> findAllEmail(String email);

    //password
    @Query(value ="select * from register where password = ?1", nativeQuery = true)
    List <Register> findAllPassword(String password);

}