package com.example.blog.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class HelloController {

    @GetMapping("hello/say")
    public String Say() {
        return "Hello World! 这是我创建的第一个SpringBoot项目。";
    }

    @GetMapping("hello/log/{id}")
    public String Log(@PathVariable("id") String id) {
        log.info("message");
        return id;
    }
}
