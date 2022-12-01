package com.team7.mystudyroom.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.team7.mystudyroom.repositories.TipTypeRepository;

@Service
@Transactional
public class TipTypeService {
    private TipTypeRepository tipTypeRepository;

    public TipTypeService( TipTypeRepository tipTypeRepository){
        this.tipTypeRepository = tipTypeRepository;
    }

    public void saveTipType(TipTypeRepository tipTypeRepository){
        tipTypeRepository.save(tipType);
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
