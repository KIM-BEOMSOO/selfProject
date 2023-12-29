package com.project.www;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.nanumsol.www.domain.PageHandler;

public class PageHandlerTest {

	@Test 
	public void test() {
		//매개변수 삽입(2개)
		PageHandler ph = new PageHandler(250,1);
		
		//테스트를 위해 만든 print메서드 실행 (결과 표출)
		ph.print();
		
		//ph에 담긴 값 확인 (배열)
		System.out.println("ph = " + ph);
		
		//우리가 예상 값이 맞는지 확인 (맞다면 테스트 통과 / 틀리면 테스트 실패)
		assertTrue(ph.getBeginPage() == 1);
		assertTrue(ph.getEndPage() == 10);
		
	}
	
	
//	@Test 
//	public void test2() {
//		PageHandler ph = new PageHandler(250,11);
//		ph.print();
//		System.out.println("ph = " + ph);
//		assertTrue(ph.getBeginPage() == 11);
//		assertTrue(ph.getEndPage() == 20);
//		
//	}
//	
//	@Test 
//	public void test3() {
//		PageHandler ph = new PageHandler(256,50);
//		ph.print();
//		System.out.println("ph = " + ph);
//		assertTrue(ph.getBeginPage() == 21);
//		assertTrue(ph.getEndPage() == 26);
//		
//	}
}
