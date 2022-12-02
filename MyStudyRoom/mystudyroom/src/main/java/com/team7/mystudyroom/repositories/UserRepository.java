package com.team7.mystudyroom.repositories;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

import com.team7.mystudyroom.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}