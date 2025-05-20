package com.univ.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univ.bean.Admin;
import com.univ.bean.User;
import com.univ.repository.AdminRepository;

import jakarta.transaction.Transactional;
;

@Service
public class AdminServices {
	@Autowired
	AdminRepository adminRepo;
	
	
	
	  
	  public Admin insert(Admin adm) {
	  System.out.println("Saving Admin: " + adm); 
	  Admin savedAdmin = adminRepo.save(adm); 
	  System.out.println("Saved Admin: " + savedAdmin); 
	  return savedAdmin; }
	 
	 
	public Admin checkLogin(String unm, String pw) {
		return adminRepo.getLogin(unm, pw);
	}
	
}
