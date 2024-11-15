package com.ram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.service.JunitService;

@RestController
public class JunitController {

	@Autowired
	private JunitService service;
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getGreet() {
		return new ResponseEntity<String>(service.getGreet(),HttpStatus.OK);
	}

	@GetMapping("/greet")
	public ResponseEntity<String> getWelcome() {
		return new ResponseEntity<String>(service.getWelcome(),HttpStatus.OK);
	}
}
