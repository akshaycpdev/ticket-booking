package com.ticketease.auth.controller;

import com.ticketease.auth.dto.LoginRequest;
import com.ticketease.auth.dto.RegisterRequest;
import com.ticketease.auth.model.User;
import com.ticketease.auth.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserRepository userRepository;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody RegisterRequest req) {
        User user = User.builder()
                .mobileNumber(req.getMobileNumber())
                .password(req.getPassword())
                .fullName(req.getFullName())
                .build();
        return ResponseEntity.ok(userRepository.save(user));
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody LoginRequest req) {
        // Dummy login for skeleton
        return ResponseEntity.ok(Map.of("token", "dummy-jwt-token"));
    }
}
