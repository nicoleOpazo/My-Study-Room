package com.team7.mystudyroom.services;

import java.util.List;

import com.team7.mystudyroom.models.UserType;

public interface UserTypeServiceImpl {

  UserType  getUserType(Integer user_type_id);

  UserType  save (UserType register);

  void delete(Integer user_type_id);

  List <UserType> getAllUserTypes();


    
}
