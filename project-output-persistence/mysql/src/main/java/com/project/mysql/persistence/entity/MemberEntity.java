package com.project.mysql.persistence.entity;

import com.project.application.domain.member.Member;
import lombok.*;

//@Entity
//@Table(name = "member", schema = "proejct")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class MemberEntity {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //@Column(length = 10, unique = true)
    private String username;

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
                .build();
    }
}
