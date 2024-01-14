package com.example.blog.controller;

import com.example.blog.entity.Message;
import com.example.blog.service.RedisService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacheController {

    public final RedisService redisService;

    public CacheController(RedisService redisService) {
        this.redisService = redisService;
    }

    @GetMapping("cache/{id}")
    public Boolean SetCache(@PathVariable("id") String id) {
        Message msg = new Message((long)1, "url", "b", "c");
        try {
            this.redisService.set(id, msg);
            return true;
        } catch (NullPointerException e) {
            return false;
        }
    }
}
