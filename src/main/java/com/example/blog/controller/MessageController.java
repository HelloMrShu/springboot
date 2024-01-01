package com.example.blog.controller;

import com.example.blog.entity.Message;
import com.example.blog.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {
    private final MessageService msgService;

    public MessageController(MessageService msgService) {
        this.msgService = msgService;
    }

    @GetMapping("message/list")
    public List<Message> List() {
        return this.msgService.getList();
    }
}
