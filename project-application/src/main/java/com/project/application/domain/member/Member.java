package com.project.application.domain.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Member {
    private Long id;
    private String name;
    String email;
    String phoneNumber;
    String dateOfBirth;
    Gender gender;
    String address;
}
