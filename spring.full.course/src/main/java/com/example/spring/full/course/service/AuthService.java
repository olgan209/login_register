package com.example.spring.full.course.service;

import com.example.spring.full.course.dto.AuthLoginRequest;
import com.example.spring.full.course.dto.AuthLoginResponse;
import com.example.spring.full.course.dto.UserRegisterRequest;

public interface AuthService {

    void register(UserRegisterRequest userRegisterRequest);

    AuthLoginResponse login(AuthLoginRequest authLoginRequest);
}
