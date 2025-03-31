package com.project.mysql.persistence.repository.member;

import com.project.mysql.persistence.entity.member.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
}
