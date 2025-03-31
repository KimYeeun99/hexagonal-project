package com.project.application.service.member;

import com.project.application.port.input.MemberUseCase;
import com.project.application.port.input.dto.request.member.LoginRequest;
import com.project.application.port.input.dto.request.member.MemberRegistRequest;
import com.project.application.port.input.dto.response.member.MemberResponse;
import com.project.application.port.output.persistence.MemberPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService implements MemberUseCase {
    private final MemberPort memberPort;

    @Override
    public void login(LoginRequest request) {
        memberPort.existMemberAuth(request.email());
    }

    @Override
    public MemberResponse getMember(long id) {
        return MemberResponse.of(memberPort.findById(id));
    }

    @Override
    public void registerMember(MemberRegistRequest request) {
        memberPort.saveMember(request.registMember());
    }
}
