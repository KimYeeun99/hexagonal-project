package com.project.mysql.adapter;

import com.project.application.domain.member.Member;
import com.project.application.port.output.persistence.MemberPort;
import com.project.mysql.persistence.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberAdapter implements MemberPort {
    //private final MemberRepository memberRepository;

    @Override
    public Member findById(Long id) {
        //MemberRepository -> MemberEntity -> MemberEntity.toDomain
        return Member.builder()
                .username("이름")
                .id(2L)
                .build();
    }
}
