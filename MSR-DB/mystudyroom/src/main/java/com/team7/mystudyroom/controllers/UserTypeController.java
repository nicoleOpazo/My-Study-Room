package com.team7.mystudyroom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.team7.mystudyroom.models.UserType;
import com.team7.mystudyroom.services.UserTypeService;

@RestController
@CrossOrigin("*")
public class UserTypeController {
    private UserTypeService userTypeService;

    public UserTypeController(@Autowired UserTypeService userTypeService){
        this.userTypeService = userTypeService;
    }

    @PostMapping("/UserType/save")
    public void guardarUserType(@RequestBody UserType userType){
        userTypeService.saveUserType(userType);
    }

    @PutMapping("/UserType/update")
    public void actualizarUserType(@RequestBody UserType userType){
        userTypeService.updateUserType(userType);
    }

    @GetMapping("/UserType/findAll")
    public List <UserType> todasLosUserType(){
        return userTypeService.findAll();
    }

    @DeleteMapping("/UserType/eliminarUserType/{user_type_id}")
    public void deleteUserType(@PathVariable Integer user_type_id){
        userTypeService.eliminarUserType(user_type_id);
    }
}
