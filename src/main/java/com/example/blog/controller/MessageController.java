package com.example.blog.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.blog.entity.Message;
import com.example.blog.service.MessageService;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MessageController {
    private final MessageService msgService;

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
