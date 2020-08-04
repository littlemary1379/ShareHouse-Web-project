package com.mysh.shareHouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping({"", "/"})
	public String index() {
		return "index";
	}
	
	@GetMapping("/moveInGuide")
	public String moveInGuide() {
		return "/page/moveInGuide";
	}
	
	@GetMapping("/putOutRoom")
	public String putOutRoom() {
		return "/page/putOutRoom";
	}
	

	
}
