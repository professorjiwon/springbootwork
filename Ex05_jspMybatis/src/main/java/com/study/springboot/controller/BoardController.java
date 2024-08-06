package com.study.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {
	
	@RequestMapping("/")
	public String root() throws Exception{
		return "redirect:list";
	}
	
	@RequestMapping("/list")
	public String list(){
		return "list";
	}

}
