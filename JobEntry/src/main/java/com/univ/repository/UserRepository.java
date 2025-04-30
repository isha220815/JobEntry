package com.univ.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.univ.bean.User;

public interface UserRepository extends JpaRepository<User, Integer>  {

}
