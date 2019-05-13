package com.example.ids.myappis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ids.myappis.entities.Blog;

public interface BlogRepository 
extends JpaRepository<Blog, Long>{
	
}
