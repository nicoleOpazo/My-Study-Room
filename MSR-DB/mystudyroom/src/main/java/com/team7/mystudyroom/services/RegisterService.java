package com.team7.mystudyroom.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.team7.mystudyroom.models.Register;
import com.team7.mystudyroom.repositories.RegisterRepository;

@Service
@Transactional
public class RegisterService {
    private RegisterRepository registerRepository;

    public RegisterService(RegisterRepository registerRepository){
        this.registerRepository = registerRepository;
    }

    public void saveRegister(Register register){
        registerRepository.save(register);
    }

    public void updateRegister(Register register){
        registerRepository.save(register);
    }

    public List <Register> findAll(){
        return registerRepository.findAll();
    }

    public void eliminarRegister(Integer register_id){
        registerRepository.deleteById(register_id);
    }
    
}