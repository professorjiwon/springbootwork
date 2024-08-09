package com.study.springboot.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.springboot.domain.Member;
import com.study.springboot.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping("/")
	public String root() {
		return "menu";
	}
	
	@RequestMapping("/selectAll")
	public String selectAll(Model model) {
		List<Member> list = memberService.selectAll();
		model.addAttribute("mList", list);
		return "selectAll";
	}
	
	@RequestMapping("/selectById")
	public String selectById(@RequestParam("id") Long id, Model model) {
		Optional<Member> member = memberService.selectById(id);
		
		if(member.isPresent()) {  
			model.addAttribute("member", member.get());
		} else {
			model.addAttribute("member", null);
		}
		
		return "select_id";
	}
	
	@RequestMapping("/selectByName")
	public String selectByName(String name, Model model) {
		Optional<Member> member = memberService.selectByName(name);
		model.addAttribute("member", member.get());
		return "select_name";
	}
	
	
	
	
}