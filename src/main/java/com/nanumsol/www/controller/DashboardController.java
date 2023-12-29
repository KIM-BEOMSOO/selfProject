package com.nanumsol.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
	
	//대시보드 이동
	@GetMapping("dashBoard")
	public String dashBoard() {
		return "dashBoard/dashBoard";
	}

}
