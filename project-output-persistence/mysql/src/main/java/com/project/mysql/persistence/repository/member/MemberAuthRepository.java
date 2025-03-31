package com.project.mysql.persistence.repository.member;

import com.project.mysql.persistence.entity.member.MemberAuthEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberAuthRepository extends JpaRepository<MemberAuthEntity, Long> {
    boolean existsByEmail(String email);
}
