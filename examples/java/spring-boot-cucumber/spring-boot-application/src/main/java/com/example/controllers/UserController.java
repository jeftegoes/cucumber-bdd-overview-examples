package com.example.controllers;

import com.example.entities.RoleEnum;
import com.example.entities.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final List<User> users = new ArrayList<>(List.of(
            new User("Jefté", "12345", RoleEnum.ADMIN),
            new User("Brenno", "54321", RoleEnum.USER))
    );

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        for (User u : users) {
            if (u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword())) {
                return ResponseEntity.ok("Welcome, " + u.getUsername() + "! Your role is: " + u.getRole().name());
            }
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
    }
}