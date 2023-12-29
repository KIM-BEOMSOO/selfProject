package com.nanumsol.www.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nanumsol.www.dao.BoardDao;
import com.nanumsol.www.domain.BoardDto;

@Repository
public class BoardServiceImpl implements BoardService {
	
	//2. BoardDao @Autowired 진행
	@Autowired
	BoardDao boardDao;

	//사원 정보 저장
	@Override
	public int empDataInsert(BoardDto boardDto) throws Exception {
		//1. BoardDao를 @Autowired해주지 않으면 에러 발생 (import를 해도 마찬가지)
		return boardDao.empDataInsert(boardDto);
	}

	//사원 게시판 출력
	@Override
	public List<BoardDto> selectAll() throws Exception {
		return boardDao.selectAll();
	}
	
	//사원 상세정보
	@Override
	public BoardDto read(String emp_no) throws Exception {
		return boardDao.select(emp_no); 
	}
	
}

