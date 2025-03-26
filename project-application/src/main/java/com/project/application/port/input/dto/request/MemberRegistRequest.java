package com.project.application.port.input.dto.request;

import com.project.application.domain.member.Gender;
import com.project.application.domain.member.Member;
import com.project.application.domain.member.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public record MemberRegistRequest(
        String username,
        Role role,
        @Email
        String email,
        String phoneNumber,
        @Size(min = 8, max = 8, message = "생년월일은 6자리로 입력해주세요.")
        String dateOfBirth,
        Gender gender,
        String address
) {
        public Member registMember() {
                return Member.builder()
                        .username(this.username)
                        .email(this.email)
                        .phoneNumber(this.phoneNumber)
                        .dateOfBirth(this.dateOfBirth)
                        .gender(this.gender)
                        .address(this.address)
                        .build();
        }
}
