package com.example.workshopmongo.config;

import com.example.workshopmongo.domain.User;
import com.example.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {
    
    @Autowired
    private UserRepository useRepository;
    
    @Override
    public void run(String ... args) throws Exception {

        useRepository.deleteAll();

        User dario = new User(null, "dario", "dario@email.com");
        User pessoa = new User(null, "pessoa", "pessoa@email.com");
        User outrapessoa = new User(null, "outrapessoa", "outrapessoa@email.com");

        useRepository.saveAll(Arrays.asList(dario, pessoa, outrapessoa));
    }
}
