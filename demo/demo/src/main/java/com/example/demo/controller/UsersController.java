package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Users;
import com.example.demo.service.UsersService;

@Controller
@RequestMapping("/api")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping("/save")
    public ResponseEntity<?> saveUser(@RequestBody Users user) {
        usersService.addUser(user);
        return ResponseEntity.ok("User saved successfully");
    }

    @GetMapping("/get")
    public ResponseEntity<?> getUsers() {
        List<Users> response = usersService.getUsers();
        return ResponseEntity.ok(response);
    }

}
