package com.todo.todo.service;

import com.todo.todo.dto.JwtAuthResponse;
import com.todo.todo.dto.LoginDto;
import com.todo.todo.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);

    JwtAuthResponse login(LoginDto loginDto);
}