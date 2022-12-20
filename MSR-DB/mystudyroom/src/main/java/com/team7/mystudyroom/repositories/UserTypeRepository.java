package com.team7.mystudyroom.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.team7.mystudyroom.models.UserType;

public interface UserTypeRepository extends JpaRepository <UserType, Integer> {
    @Query(value = "select * from userType where user_type_name =?1", nativeQuery = true)
    List <UserType> findAllName(String user_type_name);
}
