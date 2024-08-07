package com.study.springboot.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardDao {
	public int totalRecord();
}


