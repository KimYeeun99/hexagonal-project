package com.project.application.port.output.persistence;

import com.project.application.domain.member.Member;

public interface MemberPort {
    boolean existMemberAuth(String email);
    Member findById(Long id);
    void saveMember(Member member);
}
