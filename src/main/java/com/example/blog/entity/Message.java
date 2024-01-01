package com.example.blog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("f_message")
public class Message implements Serializable {
    private Long id;
    private String form;
    private String content;
    private String keywords;
}