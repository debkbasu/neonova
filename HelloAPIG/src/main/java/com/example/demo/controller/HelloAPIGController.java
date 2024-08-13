package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/v1")
public class HelloAPIGController {

	
	@GetMapping("/gethello")
	public ResponseEntity<String> sayHello(){
		return new ResponseEntity<>("Hello API Gateway!", HttpStatus.OK);
	}
	
}
