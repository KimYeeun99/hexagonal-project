package com.project.mysql.persistence.entity;

import com.project.application.domain.member.Gender;
import com.project.application.domain.member.Member;
import com.project.application.domain.member.Role;
import com.project.application.domain.member.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "member", schema = "development")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 자동 증가되는 ID
    @Column(name = "member_id")
    private Long id;

    @Column(name = "username", nullable = false, unique = true, length = 50)
    private String username;

    @Enumerated(EnumType.STRING)  // Enum 타입을 String으로 저장
    @Column(name = "role", nullable = false, columnDefinition = "ENUM('ADMIN', 'USER') DEFAULT 'USER'")
    private Role role;

    @Column(name = "email", nullable = false, unique = true, length = 50)
    private String email;

    @Column(name = "phone_number", length = 11)
    private String phoneNumber;

    @Column(name = "birth")
    private LocalDate dateOfBirth;

    @Enumerated(EnumType.STRING)  // Enum 타입을 String으로 저장
    @Column(name = "gender", nullable = false)
    private Gender gender;

    @Column(name = "address", columnDefinition = "TEXT")
    private String address;

    @Enumerated(EnumType.STRING)  // Enum 타입을 String으로 저장
    @Column(name = "status", nullable = false, columnDefinition = "ENUM('ACTIVE', 'INACTIVE', 'DELETED') DEFAULT 'active'")
    private Status status;

    public Member toDomain() {
        return Member.builder()
                .id(id)
                .username(username)
                .build();
    }

    public static MemberEntity of(Member member) {
        return MemberEntity.builder()
                .id(member.getId())
                .username(member.getUsername())
                .email(member.getEmail())
                .phoneNumber(member.getPhoneNumber())
                .dateOfBirth(LocalDate.parse(member.getDateOfBirth(), DateTimeFormatter.BASIC_ISO_DATE))
                .gender(member.getGender())
                .address(member.getAddress())
                .build();
    }
}
