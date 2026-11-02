package com.example.aws_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from AWS ECS, deployed by GitHub Actions!";
    }
}
