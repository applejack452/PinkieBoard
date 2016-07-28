package com.pinkieboard.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

	@RequestMapping("/home")
	public String home(){
		
		return "hi!!";
	}
}
