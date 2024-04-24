package com.codemy.backdev.controller;

import com.codemy.backdev.model.User;
import com.codemy.backdev.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User userRegister(@RequestBody User userRegister){
        return userRepository.save(userRegister);
    }

    @GetMapping("/users")
    List<User> allUsers(){
        return userRepository.findAll();
    }


     


}