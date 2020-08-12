package com.mysh.shareHouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PutOutRoomController {

	@GetMapping("/putOutRoom")
	public String putOutRoom() {
		return "/page/putOutRoom";
	}
	
	@GetMapping("/putOutRoom/entrust")
	public String Entrust() {
		return "/page/entrust";
	}
}
