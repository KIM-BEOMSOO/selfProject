package com.project.www;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//고정
@RunWith(SpringJUnit4ClassRunner.class)

//DB 연결정보가 들어있는 파일 경로 설정
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class DBConnectionTest {

	//@Autowired = import
	@Autowired
	
	//DataSource객체 = DB 커넥션 정보를 가지고 있음
	DataSource ds; 
	
	//Test를 진행하고 싶은 메서드 위에 @Test 붙여줌 
	@Test
	public void jdbcConnectionTest() throws Exception {
		Connection conn = ds.getConnection(); //DataSource 객체에 접근하여 DB연결 정보를 얻어옴
		System.out.println("conn = " + conn); //연결 정상여부 확인 
	}
}
