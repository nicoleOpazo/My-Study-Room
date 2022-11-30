package com.team7.mystudyroom.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.team7.mystudyroom.models.UserType;
import com.team7.mystudyroom.repositories.UserTypeRepository;

@Service
@Transactional
public class UserTypeService {
    private UserTypeRepository userTypeRepository;

    public UserTypeService(UserTypeRepository userTypeRepository){
        this.userTypeRepository = userTypeRepository;
    }

    public void saveUserType(UserType userType){
        userTypeRepository.save(userType);
    }

    public void updateUserType(UserType userType){
        userTypeRepository.save(userType);
    }

    public List <UserType> findAll(){
        return userTypeRepository.findAll();
    }

    public void eliminarUserType(Integer user_type_id){
        userTypeRepository.deleteById(user_type_id);
    }
    
}
