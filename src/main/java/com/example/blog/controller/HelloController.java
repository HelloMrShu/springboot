package com.example.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("hello/say")
    public String Say() {
        return "Hello World! 这是我创建的第一个SpringBoot项目。";
    }
}
