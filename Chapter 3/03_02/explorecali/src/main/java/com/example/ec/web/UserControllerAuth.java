package com.example.ec.web;

import com.example.ec.service.UserServiceAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserControllerAuth {
    @Autowired
    private UserServiceAuth userService;

    @PostMapping("/signin2")
    public Authentication login(@RequestBody @Valid LoginDto loginDto) {
       return userService.signin(loginDto.getUsername(), loginDto.getPassword()) ;
    }
}