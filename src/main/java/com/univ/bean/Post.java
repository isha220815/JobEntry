package com.univ.bean;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "jobs")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String title;
    
    @Column(nullable = false)
    private String company;
    
    @Column(columnDefinition = "TEXT")
    private String description;
    
    private String location;
    private String salary;
    
    @Column(columnDefinition = "TEXT")
    private String requirements;
    
    private String jobType;
    private String contactEmail;
    private boolean isActive = true;
    
    @Column(columnDefinition = "DATETIME")
    private LocalDateTime createdAt = LocalDateTime.now();


    public Post(String title, String company, String description) {
        this.title = title;
        this.company = company;
        this.description = description;
    }


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	public String getRequirements() {
		return requirements;
	}


	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}


	public String getJobType() {
		return jobType;
	}


	public void setJobType(String jobType) {
		this.jobType = jobType;
	}


	public String getContactEmail() {
		return contactEmail;
	}


	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}