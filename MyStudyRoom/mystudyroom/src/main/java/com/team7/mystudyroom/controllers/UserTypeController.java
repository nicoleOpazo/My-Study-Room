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
        userTypeService.save(userType);
    }

    @PutMapping("/UserType/update")
    public void actualizarUserType(@RequestBody UserType userType){
        userTypeService.save(userType);
    }

    @RequestMapping("/UserType/findAll")
    public List <UserType> getAllUserTypes(){
        List <UserType> listaTypeUser = userTypeService.getAllUserTypes();
        return listaTypeUser;
    }

    @GetMapping("/UserType/{user_type_id}")
    public UserType getUserType(@PathVariable Integer user_type_id){
        return userTypeService.getUserType(user_type_id);
    }

    @DeleteMapping("/UserType/eliminarUserType/{user_type_id}")
    public void deleteUserType(@PathVariable Integer user_type_id){
        userTypeService.delete(user_type_id);
    }
}
