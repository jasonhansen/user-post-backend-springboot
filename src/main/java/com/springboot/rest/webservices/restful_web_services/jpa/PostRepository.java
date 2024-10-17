package com.springboot.rest.webservices.restful_web_services.jpa;

import com.springboot.rest.webservices.restful_web_services.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
