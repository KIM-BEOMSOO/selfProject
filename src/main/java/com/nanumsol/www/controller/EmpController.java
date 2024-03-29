package com.nanumsol.www.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nanumsol.www.dto.BoardDto;
import com.nanumsol.www.service.employee.BoardService;

@Controller
public class EmpController {
	
	//Service Autowired 
	@Autowired 
	BoardService boardService;
	
	//사원 게시판 이동
	@GetMapping("employeeListBoard")
	public String empBoard(Model m) throws Exception{
		List<BoardDto> list = boardService.selectAll();
		//Model객체에 list값 저장 (jsp에서 list라는 변수에 접근하여 쿼리 결과 확인 가능)
		m.addAttribute("list",list);
		
		m.addAttribute(list);
		return "employee/employeeListBoard";
	}
	
	/* 사원 상세정보 화면 이동 */
	@GetMapping("employeeDetail")
	public String read(String emp_no, Model m) throws Exception {
		BoardDto boardDto = boardService.read(emp_no);
		m.addAttribute("boardDto", boardDto);

		return "employee/employeeDetail";
	}
	
	/* 사원 상세정보 수정화면 이동 */
	@GetMapping("employeeInformationModifyForm")
	public String employeeInformationModifyForm(String emp_id, Model m) throws Exception{
		BoardDto boardDto = boardService.read(emp_id);
		m.addAttribute("boardDto", boardDto);
		return "employee/employeeInformationModifyForm";
	}
	
	/* 사원 등록 화면 이동 */
	@GetMapping("employeeDataInsertForm")
	public String empInsert() {
		return "employee/employeeDataInsertForm";
	}

	/* 사원 정보 등록 */
	@PostMapping("empDataInsert")
	public String empDataInsert(BoardDto boardDto) throws Exception {
		boardService.empDataInsert(boardDto);
		return "redirect:/empBoard";
	}
	
	
}
