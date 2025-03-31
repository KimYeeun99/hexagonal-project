package com.project.application.port.input.dto.request.member;

import com.project.application.domain.member.LoginAuth;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record LoginRequest(
        @Email
        @NotNull
        String email,
        @NotNull
        String password
) {
    public LoginAuth login() {
        return LoginAuth.builder()
                .email(email)
                .passwordHash(password) //password to hash
                .build();
    }
}
