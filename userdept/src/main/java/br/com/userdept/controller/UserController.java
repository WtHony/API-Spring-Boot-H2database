package br.com.userdept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.userdept.model.User;
import br.com.userdept.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findall() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public User findByIdUser(@PathVariable Long id) {
        return repository.findById(id).get();
    }

}
