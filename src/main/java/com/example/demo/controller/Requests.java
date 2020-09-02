package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface Requests {

    @GetMapping("/users")
    ResponseEntity<?> getAll();

    @GetMapping("/user/{id}")
    ResponseEntity<?> getUser(@PathVariable("id") String id);

    @GetMapping("/user/email/{email}")
    ResponseEntity<?> getEmail(@PathVariable("email") String email);

    @PostMapping("/Sign up")
    void save(@RequestBody User user);

    @PutMapping("update/{id}")
    ResponseEntity<?> updateUser(@PathVariable("id") String id,@RequestBody User user);


    @DeleteMapping("delete user/{id}")
    ResponseEntity<?> deleteUser(@PathVariable("id") String id);
}
