package com.example.SpringMVCproject;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.SpringMVCproject.model.Alien;



@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("add")
	public String add(@RequestParam("num 1")int i, @RequestParam("num 2")int j)
	
	{
		ModelAndView mv = new ModelAndView("result");
		
		int num3= i+j;
		
		mv.addObject("num3", num3);
		
		return "result.jsp";
	}

	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute("a1") Alien a) 
	{
		
		return "result";
	}

}
