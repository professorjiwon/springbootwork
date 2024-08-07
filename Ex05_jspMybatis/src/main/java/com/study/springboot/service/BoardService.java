package com.study.springboot.service;

import java.util.List;

import com.study.springboot.dto.Board;

public interface BoardService {
	public int totalRecord();
	public List<Board> list();
	public Board detailBoard(String boardno);
}
