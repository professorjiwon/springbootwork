package com.study.springboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import com.study.springboot.domain.Board;
import com.study.springboot.repository.BoardRepository;

@Service
public class BoardService {
	
	@Autowired
	BoardRepository boardRepository;

	public Board insert(Board board) {
		return boardRepository.save(board);		
	}

	public Page<Board> list(PageRequest of) {
		return boardRepository.findAll(of);
	}

	public Optional<Board> selectDetail(Long bno) {
		return boardRepository.findById(bno)
							  .map(board-> {
							      board.setCount(board.getCount() + 1);
							      return boardRepository.save(board);
							   });
	}

	public Board update(Board board) {
		Board rboard = boardRepository.findById(board.getBno()).get();
		System.out.println("rboard : " + rboard);
		rboard.setTitle(board.getTitle());
		rboard.setContent(board.getContent());
		return boardRepository.save(rboard);
	}

	public void delete(Long bno) {
		boardRepository.deleteById(bno);
	}


}
