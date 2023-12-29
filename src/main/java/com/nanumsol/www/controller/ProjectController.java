package com.nanumsol.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {
	
	//프로젝트 게시판 이동
	@GetMapping("projectBoard")
	public String project() {
		return "project/projectBoard";
	}
	

}
