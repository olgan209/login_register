package com.example.spring.full.course.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserRegisterRequest {
    private String password;
    private String username;
    private String email;
}
