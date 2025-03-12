package com.project.mysql.persistence.repository;

import com.project.mysql.persistence.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
}
