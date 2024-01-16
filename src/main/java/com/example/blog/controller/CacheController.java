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

    @GetMapping("cache/set/{id}")
    public Boolean SetCache(@PathVariable("id") Long id) {
        Message msg = new Message();
        msg.setId(id);
        msg.setForm("url");
        msg.setContent("this is content");
        msg.setKeywords("keywords");

        try {
            this.redisService.set(id.toString(), msg);
            return true;
        } catch (NullPointerException e) {
            return false;
        }
    }

    @GetMapping("cache/{id}")
    public Object GetCache(@PathVariable("id") Long id) {
        try {
            return this.redisService.get(id.toString());
        } catch (NullPointerException e) {
            return false;
        }
    }
}
