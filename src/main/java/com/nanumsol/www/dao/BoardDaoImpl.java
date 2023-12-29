package com.nanumsol.www.dao;



import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nanumsol.www.domain.BoardDto;

@Repository
public class BoardDaoImpl implements BoardDao {

	//쿼리 실행에 필요한 메서드 제공 객체
	@Autowired
	SqlSession session;
	
	//namespace지정
	String  namespace="com.nanumsol.www.dao.BoardMapper.";
	
	@Override
	public List<BoardDto> selectAll() throws Exception {
	//session객체의 selectList함수를 사용하여 namespace+id와 일치하는 쿼리 실행
	return session.selectList(namespace+"selectAll");
	}

	@Override
	public int empDataInsert(BoardDto boardDto) throws Exception {
		return session.insert(namespace+"empDataInsert", boardDto);
	}

	@Override
	public BoardDto select(String emp_no) throws Exception {
		return session.selectOne(namespace+"select", emp_no);
	}
}
