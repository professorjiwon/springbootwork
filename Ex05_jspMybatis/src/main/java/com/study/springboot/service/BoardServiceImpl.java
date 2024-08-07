package com.study.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.springboot.dto.Board;
import com.study.springboot.repository.BoardDao;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDao boardDao;
	
	@Override
	public int totalRecord() {
		return boardDao.totalRecord();
	}

	@Override
	public List<Board> list() {
		return boardDao.list();
	}

	@Override
	public Board detailBoard(String boardno) {
		return boardDao.detailBoard(boardno);
	}

}
