package com.team7.mystudyroom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.team7.mystudyroom.models.Admin;

public interface AdminRepository extends JpaRepository <Admin, Integer>{
    
}
