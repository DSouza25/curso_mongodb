package com.example.workshopmongo.resource;

import com.example.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UseResource {

    @GetMapping()
    public ResponseEntity<List<User>> findAll(){
        User dario = new User("001", "Dario", "dss@gmail.com");
        User pessoa = new User("002", "Pessoa", "pessoa@gmail.com");
        List<User> users = new ArrayList<>();
        users.add(dario);
        users.add(pessoa);
        return ResponseEntity.ok().body(users);
    }
}
