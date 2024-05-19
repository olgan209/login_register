package com.example.spring.full.course.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthLoginRequest {
    private String email;
    private String password;

}
