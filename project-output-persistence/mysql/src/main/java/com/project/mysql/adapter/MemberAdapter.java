package com.project.mysql.adapter;

import com.project.application.domain.member.Member;
import com.project.application.port.output.persistence.MemberPort;
import com.project.common.exception.ExceptionCode;
import com.project.common.exception.ProjectException;
import com.project.mysql.persistence.entity.member.MemberEntity;
import com.project.mysql.persistence.repository.member.MemberAuthRepository;
import com.project.mysql.persistence.repository.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberAdapter implements MemberPort {
    private final MemberAuthRepository memberAuthRepository;
    private final MemberRepository memberRepository;

    @Override
    public boolean existMemberAuth(String email) {
        return memberAuthRepository.existsByEmail(email);
    }

    @Override
    public Member findById(Long id) {
        return memberRepository.findById(id)
                .orElseThrow(() -> new ProjectException(ExceptionCode.NOT_FOUND))
                .toDomain();
    }

    @Override
    public void saveMember(Member member) {
        memberRepository.save(MemberEntity.of(member));
    }
}
