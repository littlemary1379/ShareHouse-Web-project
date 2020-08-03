package com.mysh.shareHouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
	
	@GetMapping({"", "/"})
	public String index() {
		return "index";
	}
	
	@GetMapping("/entrust")
	public String Entrust() {
		return "/main/entrust";
	}
	
	@GetMapping("/move")
	public String moveInGuide() {
		return "/main/moveInGuide";
	}
	
	
}
