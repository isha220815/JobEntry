package com.univ.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class JobApply {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String fullName;
	    private String email;
	    private String contact;
	    private String skills;
	    private String location;

	    private String resumeFileName;

	    @ManyToOne
	    private Post post;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getContact() {
			return contact;
		}

		public void setContact(String contact) {
			this.contact = contact;
		}

		public String getSkills() {
			return skills;
		}

		public void setSkills(String skills) {
			this.skills = skills;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getResumeFileName() {
			return resumeFileName;
		}

		public void setResumeFileName(String resumeFileName) {
			this.resumeFileName = resumeFileName;
		}

		public Post getPost() {
			return post;
		}

		public void setPost(Post post) {
			this.post = post;
		}

		@Override
		public String toString() {
			return "JobApply [id=" + id + ", fullName=" + fullName + ", email=" + email + ", contact=" + contact
					+ ", skills=" + skills + ", location=" + location + ", resumeFileName=" + resumeFileName + ", post="
					+ post + "]";
		}

		public JobApply(Long id, String fullName, String email, String contact, String skills, String location,
				String resumeFileName, Post post) {
			super();
			this.id = id;
			this.fullName = fullName;
			this.email = email;
			this.contact = contact;
			this.skills = skills;
			this.location = location;
			this.resumeFileName = resumeFileName;
			this.post = post;
		}

		public JobApply() {
			super();
			// TODO Auto-generated constructor stub
		}

	    
	}


