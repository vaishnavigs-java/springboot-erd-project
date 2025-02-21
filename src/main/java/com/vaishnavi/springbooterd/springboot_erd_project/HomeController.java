package com.vaishnavi.springbooterd.springboot_erd_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")  // This makes it accessible at localhost:8080/
public class HomeController {

    @GetMapping
    public String home() {
        return "Welcome to the Spring Boot ERD Project!";
    }
}