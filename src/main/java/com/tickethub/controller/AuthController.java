package com.tickethub.controller;

import com.tickethub.dto.authDto.LoginRequestDTO;
import com.tickethub.dto.authDto.LoginResponseDTO;
import com.tickethub.dto.authDto.RegisterRequestDTO;
import com.tickethub.dto.userDto.UserResponseDTO;
import com.tickethub.services.JwtService;
import com.tickethub.services.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;
    private final JwtService jwtService;

    @PostMapping("/register")
    public ResponseEntity<UserResponseDTO> register(@Valid @RequestBody RegisterRequestDTO request) {
        UserResponseDTO user = userService.registerUser(request);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@Valid @RequestBody LoginRequestDTO request) {
        UserResponseDTO user = userService.loginUser(request);
        String token = jwtService.generateToken(user.getEmail(), user.getRole(), user.getId());
        
        LoginResponseDTO response = new LoginResponseDTO();
        response.setToken(token);
        response.setTokenType("Bearer");
        response.setUser(user);
        
        return ResponseEntity.ok(response);
    }

    @PostMapping("/register/admin")
    public ResponseEntity<UserResponseDTO> registerAdmin(@Valid @RequestBody RegisterRequestDTO request) {
        UserResponseDTO user = userService.registerAdminUser(request);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}

