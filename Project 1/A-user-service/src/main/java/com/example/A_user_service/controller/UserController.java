package com.example.A_user_service.controller;

import com.example.A_user_service.model.User;
import com.example.A_user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/hello")
    public String hello() {
        return "Hello from A-user-service running on port: " + port;
    }

    @Value("${greeting.message:Default fallback}")
    private String greeting;

    @GetMapping("/greeting")
    public String getGreeting() {
        return greeting;
    }

    // ✅ Redis-cached single user
    @GetMapping("/cache/{id}")
    public User getCachedUser(@PathVariable String id) {
        return userService.getUserById(id);
    }

    // ✅ New endpoint: fetch all users
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
