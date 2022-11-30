package com.team7.mystudyroom.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.team7.mystudyroom.models.Admin;
import com.team7.mystudyroom.repositories.AdminRepository;

@Service
@Transactional
public class AdminService {
    private AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository){
        this.adminRepository = adminRepository;
    }

    public void saveAdmin(Admin admin){
        adminRepository.save(admin);
    }

    public void updateAdmin(Admin admin){
        adminRepository.save(admin);
    }

    public List <Admin> findAll(){
        return adminRepository.findAll();
    }

    public void eliminarAdmin(Integer admin_id){
        adminRepository.deleteById(admin_id);
    }
}
