package com.example.blog.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.blog.config.RedisConfig;
import com.example.blog.entity.Message;
import com.example.blog.service.MessageService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    private final MessageService msgService;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public MessageController(MessageService msgService) {
        this.msgService = msgService;
    }

    @GetMapping("message/list")
    public IPage<Message> List(@Param("page") int page, @Param("page_size") int page_size) {

        return this.msgService.getList(page, page_size);
    }

    @GetMapping("message/{id}")
    public Message GetById(@PathVariable("id") Long id) {
        return this.msgService.getById(id);
    }
}
