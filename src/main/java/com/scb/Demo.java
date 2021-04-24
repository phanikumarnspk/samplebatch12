package com.scb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


public class Demo {

	@GetMapping("/demo")
	public String getWelcomePage() {
		return "index";
		
	}
	
}
