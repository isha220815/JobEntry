package com.univ.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.univ.service.UserService;

@Controller
public class IndexController {

	@Autowired
	UserService serv;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/index")
	public String index1() {
		return "index";
	}
	
	@RequestMapping("/about")
	public String about(){
		return "about";
	}
	
	@RequestMapping("/contact")
	public String contact(){
		return "contact";
	}
	
	@RequestMapping("/job_detail")
	public String job_detail(){
		return "job_detail";
	}
	
	@RequestMapping("/job_list")
	public String job_list(){
		return "job_list";
	}

	@RequestMapping("/testimonial")
	public String testimonial(){
		return "testimonial";
	}
	
	@RequestMapping("/reg")
	public String reg(){
		return "reg";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
}
