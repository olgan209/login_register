package com.example.spring.full.course.controller;

import com.example.spring.full.course.dto.AuthLoginRequest;
import com.example.spring.full.course.dto.AuthLoginResponse;
import com.example.spring.full.course.dto.UserRegisterRequest;
import com.example.spring.full.course.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;

    @PostMapping("/register")
    public void register(UserRegisterRequest userRegisterRequest) {
        authService.register(userRegisterRequest);
    }

    @PostMapping("/login")
    public AuthLoginResponse login(AuthLoginRequest authLoginRequest) {
        return authService.login(authLoginRequest);
    }
}
