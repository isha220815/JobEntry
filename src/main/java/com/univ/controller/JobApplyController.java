package com.univ.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.univ.bean.JobApply;
import com.univ.bean.Post;
import com.univ.repository.JobApplyRepository;
import com.univ.repository.PostRepository;

@Controller
public class JobApplyController {
	@Autowired
    private JobApplyRepository applyRepo;

    @Autowired
    private PostRepository jobRepo;

    @Value("${upload.path}")
    private String uploadPath;
    
    

    @GetMapping("/apply/{jobId}")
    public String showApplyForm(@PathVariable Long jobId, Model model) {
        model.addAttribute("jobId", jobId);
        return "apply";
    }

    @PostMapping("/submitApplication")
    public String submitApplication(@RequestParam("jobId") Long jobId,
                                    @RequestParam("fullName") String fullName,
                                    @RequestParam("email") String email,
                                    @RequestParam("contact") String contact,
                                    @RequestParam("skills") String skills,
                                    @RequestParam("location") String location,
                                    @RequestParam("resume") MultipartFile resumeFile,
                                    Model model) throws IOException {

        Post post = jobRepo.findById(jobId).orElse(null);

        String resumeFileName = resumeFile.getOriginalFilename();
        Path filePath = Paths.get(uploadPath + File.separator + resumeFileName);
        Files.write(filePath, resumeFile.getBytes());

        JobApply apply = new JobApply();
        apply.setPost(post);
        apply.setFullName(fullName);
        apply.setEmail(email);
        apply.setContact(contact);
        apply.setSkills(skills);
        apply.setLocation(location);
        apply.setResumeFileName(resumeFileName);

        applyRepo.save(apply);

        model.addAttribute("message", "Application submitted successfully!");
        return "apply";  // or redirect to home
    }
}

