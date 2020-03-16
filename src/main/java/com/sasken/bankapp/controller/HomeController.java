package com.sasken.bankapp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sasken.bankapp.UserDto;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String displayLogin() {
		return "login";
	}

	@PostMapping("/login")
	public ResponseEntity<HttpStatus> login(@ModelAttribute UserDto user,HttpSession session) {
		
		if(user.getUsername().equals("abc") && user.getPassword().equals("123"))
		{
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		}
		
		return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
	}
}
