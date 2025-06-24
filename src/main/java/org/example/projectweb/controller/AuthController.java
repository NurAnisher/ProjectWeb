package org.example.projectweb.controller;

import org.example.projectweb.model.User;
import org.example.projectweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")  // Allow cross-origin (optional for testing from frontend)

public class AuthController {

    @Autowired
    private UserService userService;

    // ✅ Register endpoint
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        try {
            User savedUser = userService.register(user);
            return ResponseEntity.ok("Registration successful for: " + savedUser.getEmail());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Registration failed: " + e.getMessage());
        }
    }

    // ✅ Login endpoint
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> credentials) {
        String email = credentials.get("email");
        String password = credentials.get("password");

        Optional<User> user = userService.login(email, password);
        if (user.isPresent()) {
            return ResponseEntity.ok("Login successful for: " + user.get().getEmail());
        } else {
            return ResponseEntity.status(401).body("Invalid email or password");
        }
    }
}
