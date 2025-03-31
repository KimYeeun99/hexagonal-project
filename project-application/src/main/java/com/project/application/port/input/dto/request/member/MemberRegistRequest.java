package com.project.application.port.input.dto.request.member;

import com.project.application.domain.member.Gender;
import com.project.application.domain.member.Member;
import com.project.application.domain.member.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public record MemberRegistRequest(
        String name,
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
                        .name(this.name)
                        .email(this.email)
                        .phoneNumber(this.phoneNumber)
                        .dateOfBirth(this.dateOfBirth)
                        .gender(this.gender)
                        .address(this.address)
                        .build();
        }
}
