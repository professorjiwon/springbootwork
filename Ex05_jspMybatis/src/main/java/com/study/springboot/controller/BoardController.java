package com.study.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	
	@RequestMapping("/list")
	public String userListPage(){
		boardService.totalRecord();
		return "list";
	}

}
