package com.study.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.study.springboot.domain.Board;
import com.study.springboot.service.BoardService;
import com.study.springboot.service.ReplyService;

import jakarta.servlet.http.HttpSession;

@Controller
@SessionAttributes("loginUser")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@Autowired
	ReplyService replyService;
	
	@GetMapping("/list")
	public String list(@RequestParam(value="nowPage", defaultValue="0") int nowPage, Model model) {
		Page<Board> pageList = boardService.list(PageRequest.of(nowPage, 10, Sort.by(Sort.Direction.DESC, "bno")));
		
		int pagePerBlock = 5;	// [1][2][3][4][5]
		int endPage = Math.min(pageList.getTotalPages(), nowPage + pagePerBlock);

		model.addAttribute("boardPage", pageList);
		model.addAttribute("nowPage", nowPage);
		model.addAttribute("endPage", endPage);
		return "board/list";
	}
	
	@GetMapping("/insertForm")
	public String insertForm() {
		return "board/insertForm";
	}
	
	@PostMapping("/insert")
	public String insert(Board board) {
		boardService.insert(board);
		return "redirect:list";
	}
	
	@GetMapping("/detailForm")
	public String detailForm(@RequestParam(value="bno") Long bno, Model model, HttpSession session) {
		model.addAttribute("board", boardService.selectDetail(bno).get());
		model.addAttribute("reply", replyService.selectAll(bno));
		session.setAttribute("boardDetailUrl", "/detailForm?bno=" + bno);
		return "board/detailForm";
	}

	@PostMapping("/update")
	public String update(Board board, Model model) {
		boardService.update(board);
		return "redirect:list";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam(value="bno") Long bno) {
		boardService.delete(bno);
		return "redirect:list";
	}
}
