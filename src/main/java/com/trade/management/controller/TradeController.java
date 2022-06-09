package com.trade.management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TradeController {
	
	@GetMapping("/")
	public String test() {	
		return "Mand Rajuu";
	}
}
