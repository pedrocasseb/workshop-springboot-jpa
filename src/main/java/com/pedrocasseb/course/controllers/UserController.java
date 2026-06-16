package com.pedrocasseb.course.controllers;

import com.pedrocasseb.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Pedro", "pedro@gmail.com", "12345678", "123456");
        return ResponseEntity.ok().body(user);
    }
}
