package com.univ.repository;

import com.univ.bean.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {


    // Search by company (Partial Match)
    List<Post> findByCompanyContainingIgnoreCase(String company);

    // Search by title and/or company
	/*
	 * @Query("SELECT j FROM Post j WHERE LOWER(j.title) LIKE LOWER(CONCAT('%', :title, '%'))"
	 * )
	 */
    
    	//List<Post> findByTitle(@Param("title") String title);
    
    List<Post> findByTitleContainingIgnoreCase(String title);

}