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

import com.team7.mystudyroom.models.User;
import com.team7.mystudyroom.services.UserService;

@RestController
@CrossOrigin("*")
public class UserController {
    private UserService userService;

    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/User/save")
    public void guardarUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @PutMapping("/User/update")
    public void actualizarUser(@RequestBody User user) {
        userService.updateUser(user);
    }

    @GetMapping("/User/findAll")
    public List<User> todosLosUsers() {
        return userService.findAll();
    }

    @DeleteMapping("/User/eliminarUser/{user_id}")
    public void deleteUser(@PathVariable Integer user_id) {
        userService.eliminarUser(user_id);
    }

}