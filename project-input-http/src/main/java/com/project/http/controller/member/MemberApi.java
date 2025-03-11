package com.project.http.controller.member;

import com.project.application.domain.member.Member;
import com.project.application.port.input.MemberUseCase;
import com.project.application.port.input.dto.response.MemberResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/member")
public class MemberApi {
    private final MemberUseCase memberUseCase;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/me")
    public MemberResponse getMember() {
        return memberUseCase.getMember(3L);
    }
}
