package com.nanumsol.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nanumsol.www.domain.BoardDto;
import com.nanumsol.www.service.BoardService;

@Controller
public class EmpController {
	
	//Service Autowired 
	@Autowired 
	BoardService boardService;
	
	//URL에 board/read가 입력되면 아래 메서드 실행
	@GetMapping("board/read")
	//사용자에게 emp_no를 받고, 이를 보여주기 위한 Model객체 생성
	public String read(String emp_no, Model m) {
		//try-catch를 안해줘서 에러 발생
		//자동완성으로 만들어줌
		try {
			BoardDto boardDto = boardService.read(emp_no);
			m.addAttribute("boardDto", boardDto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "emp/board";
	}
	
	//메인화면 이동
	@RequestMapping("")
	public String mian() {
		return "main";
	}
	
	//배정화면 이동
	@RequestMapping("asgn")
	public String asgn() {
		return "emp/asgn";
	}
	
	//대시보드 이동
	@RequestMapping("dashBoard")
	public String dashBoard() {
		return "emp/dashBoard";
	}
	
	
	//사원 등록 화면 이동
	@RequestMapping("empInsert")
	public String empInsert() {
		return "emp/empInsert";
	}
	
	//사원 게시판 이동
	//사원 게시판 = 데이터 유출이 중요하지 않아서 Get으로 정보를 가져옴
	@GetMapping("empBoard")
	public String empBoard(Model m) throws Exception{
		//BoardDto에 담긴 쿼리 결과값을 list에 담음 
		List<BoardDto> list = boardService.selectAll();
		//Model객체에 list값 저장 (jsp에서 list라는 변수에 접근하여 쿼리 결과 확인 가능
		m.addAttribute("list",list);
		
		//m.addAttribute("저장할 변수명", 저장될 값)을 적지 않고, 
		//m.addAttribute(저장될 값) << 이렇게 넣어줄 수 있다. 
		//m.addAttribute(저장될 값) << 이렇게 작성할 경우, "저장할 변수명"은 데이터 타입의 앞 글자를 소문자로 한 값으로 저장된다 
		// 즉, "list"가 변수명이 된다
		m.addAttribute(list);
		return "emp/empBoard";
	}
	
	//프로젝트 게시판 이동
	@RequestMapping("projectBoard")
	public String project() {
		return "emp/projectBoard";
	}
	
	//사원 정보 등록
	@PostMapping("empDataInsert")
	//사용자에게 입력받을 변수를 매개변수로 넣어줌 
	public String empDataInsert(BoardDto boardDto) throws Exception {
		boardService.empDataInsert(boardDto);
		//redirect를 사용
		return "redirect:/empBoard";
	}
	
	
}
