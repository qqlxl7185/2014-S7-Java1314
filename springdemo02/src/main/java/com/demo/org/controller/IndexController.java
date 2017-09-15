package com.demo.org.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/index")
public class IndexController {
	@RequestMapping()
	public String index() {
		return "index";
	}
	
	@RequestMapping("/param")
	public String param(@RequestParam("name")String namesss,String batch,HttpServletRequest request) {
		
		System.out.println("name="+namesss);
		System.out.println("batch="+batch);
		
		return "index";
	}
	
	@RequestMapping("/param/{name}")
	public String paramrest(@PathVariable("name")String namesss,String batch,HttpServletRequest request) {
		
		System.out.println("name="+namesss);
		System.out.println("batch="+batch);
		
		return "index";
	}
	
}
