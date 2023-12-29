package com.project.www;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DbConnectionTest {

	public static void main(String[] args) throws Exception {
//		String user = "c##scott"; // ID
//		String pw = "1234"; // PW 
//		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //접속 DB정보
//		String query = "SELECT SYSDATE FROM DUAL"; // Oracle 현재 날짜 출력 쿼리
//		
//		//DB 연결 객체 (Connection)
//		Connection conn = DriverManager.getConnection(url, user, pw);
//		
//		//SQL 구문 실행을 도와줌 (Statement)
//		Statement stmt = conn.createStatement();
//		
//		//쿼리 실행 결과를 변수 rs에 담음 (ResultSet)
//		ResultSet rs = stmt.executeQuery(query);
//		
//		//rs에 값이 있으면 실행해라 
//		while(rs.next()) {
//			//rs 내부의 첫 번째 index에 저장된 값을 String 데이터타입으로 받아와라
//			String curDate = rs.getString(1);
//			System.out.println(curDate);
			
		    ApplicationContext ac = new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/**/root-context.xml");
		    //DataSource = java.sql 라이브러리에 있는 객체이다.
		    //DB 커넥션 정보를 담고 있으며, 빈으로 등록하여 인자로 넘겨준다
		    DataSource ds = ac.getBean(DataSource.class);
		    Connection conn = ds.getConnection(); // 데이터베이스의 연결을 얻는다.
		    System.out.println("conn = " + conn);
	}
}
