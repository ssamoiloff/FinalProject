package com.skilldistillery.esn.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@CrossOrigin({"*", "http:localhost:4209"})
public class TestController {

	@GetMapping("ping")
	public String ping() {
		return "pong";
	}
	
}
