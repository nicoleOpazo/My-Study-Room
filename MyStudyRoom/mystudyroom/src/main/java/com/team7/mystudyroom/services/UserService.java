package com.team7.mystudyroom.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.team7.mystudyroom.models.User;
import com.team7.mystudyroom.repositories.UserRepository;

@Service
@Transactional
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(User user) {
        userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public void eliminarUser(Integer user_id) {
        userRepository.deleteById(user_id);
    }
}