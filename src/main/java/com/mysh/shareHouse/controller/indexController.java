package com.mysh.shareHouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
	@GetMapping( {"", "/"} )
	public String index() {
		return "index";
	}
	
	@GetMapping("/serviceinfo")
	public String serviceinfo() {
		return "/main/serviceinfo";
	}
	
	@GetMapping("/contract")
	public String contract() {
		return "/main/contract";
	}
	@GetMapping("/movein")
	public String movein() {
		return "/main/movein";
	}
	
	
}
