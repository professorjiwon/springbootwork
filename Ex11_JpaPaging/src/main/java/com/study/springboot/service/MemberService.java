package com.study.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.study.springboot.domain.Member;
import com.study.springboot.repository.MemberRepository;

@Service
public class MemberService {
	
	@Autowired
	MemberRepository memberRepository;

	public Page<Member> selectByNameLike(String search, Pageable pageable) {
		return memberRepository.findByNameLike(search, pageable);
	}

	public Optional<Member> selectByNameLike(String search) {
		
		return memberRepository.findByNameLike(search);
	}
}
