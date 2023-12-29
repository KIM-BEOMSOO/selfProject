package com.project.www;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nanumsol.www.dao.BoardDao;
import com.nanumsol.www.domain.BoardDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class BoardDaoImplTest {

	//BoardDao 내부에 Test할 메서드를 실행하기 위해 Autowired로 BoardDao를 import합니다.
	//Test할 메서드 = selectAll( )
	@Autowired 
	BoardDao boardDao;
	
	@Test
	public void selectAll() throws Exception{
		//boardDto변수명에 boardDao에서 실행한 selectAll( )의 결과를 담습니다 
		List<BoardDto> boardDto = boardDao.selectAll();
		
		//boardDto를 출력합니다 
		System.out.println("boardDto = " + boardDto);
	}
	
}