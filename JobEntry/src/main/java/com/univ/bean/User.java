package com.univ.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String uname,cadd,email,unm,pw;
	long mob;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getCadd() {
		return cadd;
	}
	public void setCadd(String cadd) {
		this.cadd = cadd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUnm() {
		return unm;
	}
	public void setUnm(String unm) {
		this.unm = unm;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public long getMob() {
		return mob;
	}
	public void setMob(long mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", uname=" + uname + ", cadd=" + cadd + ", email=" + email + ", unm=" + unm + ", pw="
				+ pw + ", mob=" + mob + "]";
	}
	public User(int id, String uname, String cadd, String email, String unm, String pw, long mob) {
		super();
		this.id = id;
		this.uname = uname;
		this.cadd = cadd;
		this.email = email;
		this.unm = unm;
		this.pw = pw;
		this.mob = mob;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
