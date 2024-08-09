package com.study.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springboot.domain.Member;
import com.study.springboot.repository.MemberRepository;

@Service
public class MemberService {
	
	@Autowired
	MemberRepository memberRepository;

	public Optional<Member> select(Long id) {
												// findById() : Id는 @Id를 의미(primary key)
		Optional<Member> member = memberRepository.findById(id);
		return member;
	}

	public List<Member> selectAll() {
		return memberRepository.findAll();
	}
}
