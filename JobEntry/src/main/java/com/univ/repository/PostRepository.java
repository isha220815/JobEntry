package com.univ.repository;

import com.univ.bean.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    // Search by title (Partial Match)
    List<Post> findByTitleContainingIgnoreCase(String title);

    // Search by company (Partial Match)
    List<Post> findByCompanyContainingIgnoreCase(String company);

    // Search by title and/or company
    @Query("SELECT p FROM Post p WHERE " +
           "(:title IS NULL OR LOWER(p.title) LIKE LOWER(CONCAT('%', :title, '%'))) AND " +
           "(:company IS NULL OR LOWER(p.company) LIKE LOWER(CONCAT('%', :company, '%'))) ")
    List<Post> searchPosts(@Param("title") String title, @Param("company") String company);
}