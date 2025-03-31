package com.project.application.port.input;

import com.project.application.port.input.dto.request.member.LoginRequest;
import com.project.application.port.input.dto.request.member.MemberRegistRequest;
import com.project.application.port.input.dto.response.member.MemberResponse;

public interface MemberUseCase {
    void login(LoginRequest request);

    MemberResponse getMember(long id);
    void registerMember(MemberRegistRequest request);

}
