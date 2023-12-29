package com.nanumsol.www.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.nanumsol.www.domain.BoardDto;

public interface BoardDao {
	
	//selectAll()메서드의 실행 결과를 List에 저장 
	//List에 저장된 모든 값들의 데이터 타입은 BoardDto
	List<BoardDto> selectAll() throws Exception;
	
	//사원 정보 삽입 
	int empDataInsert(BoardDto boardDto) throws Exception;

	BoardDto select(String emp_no) throws Exception; 
	
}
