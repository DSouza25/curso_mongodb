package com.example.workshopmongo.services;

import com.example.workshopmongo.domain.User;
import com.example.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServices {

    @Autowired
    private UserRepository repo;

    public List<User> findAllUsers(){
        System.out.println(repo.findAll());
        return repo.findAll();
    }
}
