package com.example.blog.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

    public IPage<Message> getList(int pageNum, int pageSize) {
        Page<Message> page = new Page<>(pageNum, pageSize);

        QueryWrapper<Message> qw = new QueryWrapper<>();
        qw.orderByDesc("id");
        return this.msgMapper.selectPage(page, qw);
    }

    public Message getById(long id) {
        return this.msgMapper.selectById(id);
    }
}
