package com.team7.mystudyroom.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.team7.mystudyroom.models.UserType;
import com.team7.mystudyroom.repositories.UserTypeRepository;

@Service
public class UserTypeService implements UserTypeServiceImpl {
    private UserTypeRepository userTypeRepository;

    public UserTypeService(UserTypeRepository userTypeRepository){
        this.userTypeRepository = userTypeRepository;
    }


    @Override
    public UserType getUserType(Integer user_type_id) {
        Optional <UserType> userTypes = userTypeRepository.findById(user_type_id);
        // TODO Auto-generated method stub
        return userTypes.orElse(null);
    }

    @Override
    public UserType save(UserType userType) {
        // TODO Auto-generated method stub
        return userTypeRepository.save(userType);
    }

    @Override
    public void delete(Integer user_type_id) {
        // TODO Auto-generated method stub
        userTypeRepository.deleteById(user_type_id);
        
    }

    @Override
    public List<UserType> getAllUserTypes() {
        // TODO Auto-generated method stub
        return userTypeRepository.findAll();
    }
    
}
