package com.example.spring.full.course.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AuthLoginResponse {
    private long id;
    private String username;
    private String password;
    private String email;
    private String token;

}
