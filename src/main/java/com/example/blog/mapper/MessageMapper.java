package com.example.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.blog.entity.Message;
import org.apache.ibatis.annotations.Mapper;;

import java.util.List;

@Mapper
public interface MessageMapper extends BaseMapper<Message> {

}
