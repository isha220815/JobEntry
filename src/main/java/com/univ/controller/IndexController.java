package com.univ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.univ.bean.Post;
import com.univ.bean.User;
import com.univ.service.PostService;
import com.univ.service.UserService;

@Controller
public class IndexController {

	@Autowired
	UserService serv;
	@Autowired
	PostService postService;
	
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
	
	@PostMapping("/reg")
	public String reg1(@ModelAttribute("usr") User usr) {
		if(usr.getUname() == null || usr.getUname().isEmpty()) {
			return "reg";
		}else {
			User u= serv.insert(usr);
			if(u!=null) {
				return "login";
			}else {
				return "reg";
			}
		}
		
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login1(@ModelAttribute("usr") User usr) {
		if(usr.getUnm().isEmpty()) {
			return "login";
		}else {
			User u=serv.checkLogin(usr.getUnm(),usr.getPw());
			if(u!=null) {
				return "index";
			}else {
				return "login";
			}
		}
	}
	
	/*
	 * @GetMapping("/job_list") public String jobList(Model model) { List<Post> jobs
	 * = postService.getAllJobs(); model.addAttribute("jobList", jobs);
	 * System.out.println("Jobs fetched: " + jobs.size());
	 * 
	 * return "job_list"; }
	 */
	
	@GetMapping("/job_list")
	public String getAllJobs(@RequestParam(value = "title", required = false) String search, Model model) {
	    List<Post> jobs;
	    if (search != null && !search.trim().isEmpty()) {
	        jobs = postService.searchJobs(search);
	    } else {
	        jobs = postService.getAllJobs();
	    }
	    model.addAttribute("jobList", jobs);
	    model.addAttribute("search", search); // To retain search term in UI
	    return "job_list";
	}


	
	
}
