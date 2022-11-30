package com.team7.mystudyroom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.team7.mystudyroom.models.Admin;
import com.team7.mystudyroom.services.AdminService;

@RestController
@CrossOrigin("*")
public class AdminController {
    private AdminService adminService;

    public AdminController(@Autowired AdminService adminService){
        this.adminService = adminService;
    }

    @PostMapping("/Admin/save")
    public void guardarAdmin(@RequestBody Admin admin){
        adminService.saveAdmin(admin);
    }

    @PutMapping("/Admin/update")
    public void actualizarAdmin(@RequestBody Admin admin){
        adminService.updateAdmin(admin);
    }

    @GetMapping("/Admin/findAll")
    public List <Admin> todosLosAdmin(){
        return adminService.findAll();
    }

    @DeleteMapping("/Admin/eliminarAdmin/{admin_id}")
    public void deleteAdmin(@PathVariable Integer admin_id){
        adminService.eliminarAdmin(admin_id);
    }
}
