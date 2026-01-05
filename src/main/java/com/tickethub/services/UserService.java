package com.tickethub.services;

import com.tickethub.dto.authDto.LoginRequestDTO;
import com.tickethub.dto.authDto.RegisterRequestDTO;
import com.tickethub.dto.userDto.UserResponseDTO;
import com.tickethub.entity.User;
import com.tickethub.enums.Roles;
import com.tickethub.exception.EmailAlreadyExistsException;
import com.tickethub.exception.InvalidCredentialsException;
import com.tickethub.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Slf4j  
public class UserService {
    
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    
    @Transactional
    public UserResponseDTO registerUser(RegisterRequestDTO request) {
        if (userRepository.existsByEmail(request.getEmail())) {
            throw new EmailAlreadyExistsException("Email is already registered: " + request.getEmail());
        }

        String hashedPassword = passwordEncoder.encode(request.getPassword());
        User newUser = new User(
            request.getEmail(),
            hashedPassword,
            request.getUsername()
        );
        
        User savedUser = userRepository.save(newUser);
        log.info("User registered successfully: {}", savedUser.getEmail());
        return convertToDTO(savedUser);
    }

    @Transactional
    public UserResponseDTO registerAdminUser(RegisterRequestDTO request) {
        if (userRepository.existsByEmail(request.getEmail())) {
            throw new EmailAlreadyExistsException("Email is already registered: " + request.getEmail());
        }

        String hashedPassword = passwordEncoder.encode(request.getPassword());
        User newUser = new User(
            null,
            request.getEmail(),
            hashedPassword,
            Roles.ADMIN,
            request.getUsername(),
            LocalDateTime.now()
        );
        
        User savedUser = userRepository.save(newUser);
        log.info("Admin user registered successfully: {}", savedUser.getEmail());
        return convertToDTO(savedUser);
    }
    
    @Transactional(readOnly = true)
    public UserResponseDTO loginUser(LoginRequestDTO request) {
        User user = userRepository.findByEmail(request.getEmail())
            .orElseThrow(() -> {
                log.warn("Login attempt with invalid email: {}", request.getEmail());
                return new InvalidCredentialsException("Invalid email or password");
            });
        
        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            log.warn("Login attempt with invalid password for email: {}", request.getEmail());
            throw new InvalidCredentialsException("Invalid email or password");
        }
        
        log.info("User logged in successfully: {}", user.getEmail());
        return convertToDTO(user);
    }
    
    private UserResponseDTO convertToDTO(User user) {
        UserResponseDTO dto = new UserResponseDTO();
        dto.setId(user.getId());
        dto.setEmail(user.getEmail());
        dto.setName(user.getName());
        dto.setRole(user.getRole().name());
        dto.setCreatedAt(user.getCreatedAt());
        return dto;
    }
}