package com.nanumsol.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	//메인화면 이동
	@GetMapping("")
	public String mian() {
		return "main";
	}

}
