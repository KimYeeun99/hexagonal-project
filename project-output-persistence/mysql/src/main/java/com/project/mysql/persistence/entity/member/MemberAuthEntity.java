package com.project.mysql.persistence.entity.member;

import com.project.application.domain.member.LoginAuth;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "member_auth", schema = "development")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class MemberAuthEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 자동 증가되는 ID
    @Column(name = "member_id")
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "password_hash", nullable = false, length = 255)
    private String passwordHash;

    @Column(name = "email", nullable = false, unique = true, length = 50)
    private String email;

    @Column(name = "last_login")
    private LocalDateTime lastLogin;

    public LoginAuth toDomain() {
        return LoginAuth.builder()
                .email(email)
                .passwordHash(passwordHash)
                .build();
    }

    /*public static MemberAuthEntity of(Member member) {
        return MemberAuthEntity.builder()
                .id(member.getId())
                .username(member.getUsername())
                .email(member.getEmail())
                .phoneNumber(member.getPhoneNumber())
                .dateOfBirth(LocalDate.parse(member.getDateOfBirth(), DateTimeFormatter.BASIC_ISO_DATE))
                .gender(member.getGender())
                .address(member.getAddress())
                .build();
    }*/
}
