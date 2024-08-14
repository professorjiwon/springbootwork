package com.study.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.springboot.domain.Reply;
import com.study.springboot.service.ReplyService;

@Controller
public class ReplyController {
	
	@Autowired
	ReplyService replyService;
	
	@PostMapping("/rinsert")
	@ResponseBody
	public boolean rinsert(Reply reply) {
		System.out.println("content : " + reply.getContent());
		System.out.println("refBno : " + reply.getRefBno());
		System.out.println("writer : " + reply.getWriter());
		replyService.rinsert(reply);
		return true;
	}
}
