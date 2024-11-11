package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Users;
import com.example.demo.repository.UsersRepository;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public void addUser(Users user) {
        usersRepository.save(user);
    }

    public List<Users> getUsers() {
        return usersRepository.findAll();
    }

}
