package com.project.application.domain.member;

import com.project.application.port.input.MemberUseCase;
import com.project.application.port.input.dto.request.MemberRegistRequest;
import com.project.application.port.input.dto.response.MemberResponse;
import com.project.application.port.output.persistence.MemberPort;
import com.project.application.port.output.persistence.TestPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService implements MemberUseCase {
    private final MemberPort memberPort;
    //private final  TestPort testPort;


    @Override
    public MemberResponse getMember(long id) {
        return MemberResponse.of(memberPort.findById(id));
        //return null;
    }

    @Override
    public void registerMember(MemberRegistRequest request) {
        memberPort.saveMember(request.registMember());
    }
}
