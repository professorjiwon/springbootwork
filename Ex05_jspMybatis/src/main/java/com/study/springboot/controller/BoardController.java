package com.study.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.springboot.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/")
	public String root() throws Exception{
		return "redirect:list";
	}
	
	/*
	 * 요청 처리 후 응답페이지로 포워딩 또는 url재요청시 응답 데이터를 담는 방법
	   1. Model 객체
	      포워딩할 뷰로 전달하고자 하는 데이터를 맵형식<key-value>로 담을 수 있는 영역
	      requestScope임. 
	      ** 단, setAttribute가 아닌 addAttribute메소드 이용
	   2. ModelAndView 객체
	      Model은 데이터를 맵형식<key-value>로 담을 수 있는 영역
	      View는 응답뷰에 대한 정보르 담을 수 있는 공간 
	 */
	@RequestMapping("/list")
	public String userListPage(Model model){
		model.addAttribute("totalRecord", boardService.totalRecord());
		return "list";
	}

}
