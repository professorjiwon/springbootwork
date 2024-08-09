package com.study.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.springboot.domain.Member;

@Repository													// Long은 @Id가 붙은 필드의 자료형
public interface MemberRepository extends JpaRepository<Member, Long> {
			
}
