package com.example.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controller1 {
	@RequestMapping("/home")
	@ResponseBody
	public String home()
	{
		System.out.print("home");
		return "home";
	}

}
