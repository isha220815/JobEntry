package com.univ.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.univ.bean.Admin;

import com.univ.bean.User;
import com.univ.service.AdminServices;
import com.univ.service.UserService;

import org.springframework.ui.Model;
@Controller
@RequestMapping("/admin")
public class AdminController {
	

	@Autowired
	AdminServices serv;
	@Autowired
	UserService userService;

	@RequestMapping("/admin_index")
	public String admin_index() {
		return "/admin/index";
	}
	
	@RequestMapping("/admin_login")
	public String admin_login(){
		return "/admin/login";
	}
	@PostMapping("/admin_login")
	public String login1(@ModelAttribute("adm") Admin adm) {
		if(adm.getUnm().isEmpty()) {
			return "/admin/login";
		}else {
			Admin a=serv.checkLogin(adm.getUnm(),adm.getPw());
			if(a!=null) {
				return "/admin/index";
			}else {
				return "/admin/login";
			}
		}
	}
	@RequestMapping("/admin_reg")
	public String admin_reg(){
		return "/admin/reg";
	}
	@PostMapping("/admin_reg")
	public String reg1(@ModelAttribute("adm") Admin adm) {
		if(adm.getAname().isEmpty()) {
			return "/admin/reg";
		}else {
			Admin a= serv.insert(adm);
			if(a!=null) {
				return "/admin/login";
			}else {
				return "/admin/reg";
			}
		}
		
	}
	@RequestMapping("/admin_view_user")
	public String viewCustomers(Model m) {
	    List<User> list = userService.getAllUsers();
	    m.addAttribute("clist", list);
	    return "/admin/view_user"; 
	}
	
	
	
}
