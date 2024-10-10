package com.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class StudentCrud {
  
	
	@GetMapping("/get")
	public String getValue() {
		return "Hello spring boot docker";
	}
	
	
}
