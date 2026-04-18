package com.example.workshopmongo.resource;

import com.example.workshopmongo.domain.User;
import com.example.workshopmongo.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UseResource {

    @Autowired
    private UserServices services;

    @GetMapping()
    public ResponseEntity<List<User>> findAll(){
        List<User> list = services.findAllUsers();
        return ResponseEntity.ok().body(list);
    }
}
