package com.project.http.controller.member;

import com.project.application.port.input.MemberUseCase;
import com.project.application.port.input.dto.request.MemberRegistRequest;
import com.project.application.port.input.dto.response.MemberResponse;
import com.project.http.controller.dto.ProjectResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/register")
    public ProjectResponse<?> registerMember(@Valid @RequestBody MemberRegistRequest request) {
        memberUseCase.registerMember(request);
        return ProjectResponse.of(
                "회원 등록 성공"
        );
    }
}
