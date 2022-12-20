package com.team7.mystudyroom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.team7.mystudyroom.models.Register;
import com.team7.mystudyroom.services.RegisterService;

@RestController
@CrossOrigin("*")
public class RegisterController {
    private RegisterService registerService;{

    }

    public RegisterController(@Autowired RegisterService registerService){
        this.registerService = registerService;
    }

    @PostMapping("/Register/save")
    public void guardarRegister(@RequestBody Register register){
        registerService.saveRegister(register);
    }

    @PutMapping("/Register/update")
    public void actualizarRegister(@RequestBody Register register){
        registerService.updateRegister(register);
    }

    @GetMapping("/Register/findAll")
    public List <Register> todosLosRegistros(){
        return registerService.findAll();
    }

    @DeleteMapping("/Register/eliminarRegister/{register_id}")
    public void deleteRegister(@PathVariable Integer register_id){
        registerService.eliminarRegister(register_id);
    }

}