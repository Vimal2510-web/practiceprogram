package com.example.SpringMVCdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("add")
	public String add(@RequestParam("num 1")int i, @RequestParam("num 2")int j, HttpSession session)
	
	{
		
		int num3= i+j;
		
		session.setAttribute("num3", num3);
		
		return "result.jsp";
	}

}
