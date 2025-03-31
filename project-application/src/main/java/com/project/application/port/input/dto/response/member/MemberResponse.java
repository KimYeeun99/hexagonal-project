package com.project.application.port.input.dto.response.member;

import com.project.application.domain.member.Member;
import lombok.AccessLevel;
import lombok.Builder;

@Builder(access = AccessLevel.PRIVATE)
public record MemberResponse(
        Long id,
        String name
) {
    public static MemberResponse of(Member member) {
        return MemberResponse.builder()
                .id(member.getId())
                .name(member.getName())
                .build();
    }
}
