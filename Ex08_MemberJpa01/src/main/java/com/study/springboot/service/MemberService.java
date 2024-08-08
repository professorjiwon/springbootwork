package com.study.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springboot.domain.Member;
import com.study.springboot.repository.MemberRepository;

@Service
public class MemberService {
	
	@Autowired
	MemberRepository memberRepository;

	public Member insert(Member member) {
		// save() : insert할 때의 메소드(JPA에 API)
		Member rMember = memberRepository.save(member);
		return rMember;	
	}

}
