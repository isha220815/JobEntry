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
    
    private LocalDateTime createdAt = LocalDateTime.now();

    // Constructors, Getters, and Setters
    public Post() {}

    public Post(String title, String company, String description) {
        this.title = title;
        this.company = company;
        this.description = description;
    }

    // Add all other getters and setters
    // (Use your IDE to generate these)
}