package com.study.springboot.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.springboot.dto.Board;

@Mapper
public interface BoardDao {
	public int totalRecord();
	public List<Board> list();
	public Board detailBoard(String boardno);
}


