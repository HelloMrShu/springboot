package com.example.blog.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.blog.entity.Message;
import com.example.blog.mapper.MessageMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    private final MessageMapper msgMapper;

    public MessageService(MessageMapper msgMapper) {
        this.msgMapper = msgMapper;
    }

    public List<Message> getList() {
        QueryWrapper<Message> qw = new QueryWrapper<>();
        qw.select("*");
        return this.msgMapper.selectList(qw);
    }
}
