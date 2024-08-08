package com.study.springboot.service;

import java.util.List;
import java.util.Map;

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

	@Override
	public int deleteBoard(String boardno) {
		return boardDao.deleteBoard(boardno);
	}

	@Override
	public int insertBoard(Map<String, String> map) {
		return boardDao.insertBoard(map);
	}

	@Override
	public int insertBoard(Board b) {
		return boardDao.insertBoard(b);
	}

}
