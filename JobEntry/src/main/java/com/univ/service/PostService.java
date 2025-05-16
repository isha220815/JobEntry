package com.univ.service;

import com.univ.bean.Post;
import com.univ.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    // Search by title
    public List<Post> searchByTitle(String title) {
        return postRepository.findByTitleContainingIgnoreCase(title);
    }

    // Search by company
    public List<Post> searchByCompany(String company) {
        return postRepository.findByCompanyContainingIgnoreCase(company);
    }

    // Search by title and company
    public List<Post> searchPosts(String title, String company) {
        return postRepository.searchPosts(title, company);
    }
}