package com.project.mysql.persistence.repository;

import com.project.mysql.config.TestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = TestConfig.class)
public class MemberRepositoryTest {
    @Test
    void 회원_정보_찾기() {
        //memberRepository.findById(3L);
    }

}