package com.example.noteapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndextConroller {
	
	@GetMapping
	public String sayhello() {
		return "Hello from note Api!!";
	}

}
