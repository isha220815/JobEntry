package com.univ.controller;

import com.univ.bean.Post;
import com.univ.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    // Endpoint to search posts by title
    @GetMapping("/search/title")
    public List<Post> searchByTitle(@RequestParam String title) {
        return postService.searchByTitle(title);
    }

    // Endpoint to search posts by company
    @GetMapping("/search/company")
    public List<Post> searchByCompany(@RequestParam String company) {
        return postService.searchByCompany(company);
    }

    // Endpoint to search posts by title and company
    @GetMapping("/search")
    public List<Post> searchPosts(@RequestParam(required = false) String title,
                                  @RequestParam(required = false) String company) {
        return postService.searchPosts(title, company);
    }
}
