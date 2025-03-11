package com.project.application.port.input;

import com.project.application.domain.member.Member;
import com.project.application.port.input.dto.response.MemberResponse;

public interface MemberUseCase {
    MemberResponse getMember(long id);
}
