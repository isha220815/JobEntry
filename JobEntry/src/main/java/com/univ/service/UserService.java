package com.univ.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.univ.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userrepo;
}
