package com.nanumsol.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AssignmentController {
	
	
	//배정화면 이동
	@GetMapping("assignment")
	public String asgn() {
		return "assignment/assignment";
	}
	


}
