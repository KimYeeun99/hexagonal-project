package com.project.mysql.adapter;

import com.project.common.exception.ExceptionCode;
import com.project.common.exception.ProjectException;
import com.project.mysql.MySQLTestApplication;
import com.project.mysql.persistence.repository.MemberRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@ExtendWith(MockitoExtension.class)
class MemberAdapterTest {
    @InjectMocks
    private MemberAdapter memberAdapter;

    @Mock
    private MemberRepository memberRepository;

    @Test
    void 회원_조회() {
        Assertions.assertThrows(ProjectException.class, () -> {
            memberAdapter.findById(3L);
        });
    }

}