package com.nanumsol.www.service.employee;

import java.util.List;

import com.nanumsol.www.dto.BoardDto;

public interface BoardService {
	//사원 정보 insert
	int empDataInsert(BoardDto boardDto) throws Exception;
	
	//사원 게시판 
	List<BoardDto> selectAll() throws Exception;

	
	BoardDto read(String emp_no) throws Exception;
}
