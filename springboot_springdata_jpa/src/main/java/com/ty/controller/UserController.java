package com.ty.controller;

import com.ty.entity.User;
import com.ty.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2018/1/1.
 */
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;
    @GetMapping("/user")
    public List<User> findOneUserById(){
       return userRepository.findAll();
    }
}
