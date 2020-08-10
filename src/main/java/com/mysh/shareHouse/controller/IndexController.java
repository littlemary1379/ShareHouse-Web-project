package com.mysh.shareHouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mysh.shareHouse.service.FAQService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class IndexController {
	
	private final FAQService faqService;
	
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
	
	@GetMapping("/findRoom")
	public String findRoom() {
		return "/page/findRoom";
	}
	
	@GetMapping("/faq/living")
	public String faqLiving(Model model) {
		model.addAttribute("faqLiving", faqService.findAll());
		return "/page/faqLiving";
	}
}
