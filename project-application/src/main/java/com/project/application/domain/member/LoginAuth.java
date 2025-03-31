package com.project.application.domain.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class LoginAuth {
    private String email;
    private String passwordHash;

}
