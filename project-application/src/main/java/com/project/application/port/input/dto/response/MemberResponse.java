package com.project.application.port.input.dto.response;

import com.project.application.domain.member.Member;
import lombok.AccessLevel;
import lombok.Builder;

@Builder(access = AccessLevel.PRIVATE)
public record MemberResponse(
        Long id,
        String username
) {
    public static MemberResponse of(Member member) {
        return MemberResponse.builder()
                .id(member.getId())
                .username(member.getUsername())
                .build();
    }
}
