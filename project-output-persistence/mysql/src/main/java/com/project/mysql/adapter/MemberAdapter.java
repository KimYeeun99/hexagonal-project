package com.project.mysql.adapter;

import com.project.application.domain.member.Member;
import com.project.application.port.output.persistence.MemberPort;
import com.project.common.exception.ExceptionCode;
import com.project.common.exception.ProjectException;
import com.project.mysql.persistence.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberAdapter implements MemberPort {
    private final MemberRepository memberRepository;

    @Override
    public Member findById(Long id) {
        return memberRepository.findById(id)
                .orElseThrow(() -> new ProjectException(ExceptionCode.NOT_FOUND))
                .toDomain();
    }
}
