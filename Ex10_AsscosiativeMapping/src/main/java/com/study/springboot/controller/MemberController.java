package com.study.springboot.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.springboot.domain.Member;
import com.study.springboot.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping("/")
	public String root() {
		return "index";
	}
	
	@RequestMapping("/minsert")
	public String minsert(Member member, Model model) {
		Member m = memberService.minsert(member);
		model.addAttribute("member", m);
		return "minsert";
	}

	@RequestMapping("/mupdate")
	public String mupdate(String id, String name, Model model) {
		Optional<Member> rm = memberService.selectById(id);
		Member m = rm.get();
		m.setName(name);
		
		Member member = memberService.minsert(m);
		model.addAttribute("member", member);
		return "index";
	}
}
