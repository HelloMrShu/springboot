package com.example.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSenderImpl javaMailSender;

    public void send(String id) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("小狂神你好啊");
        String text = id.concat(": 做该做的事 成为想要成为的人");
        simpleMailMessage.setText(text);
        simpleMailMessage.setTo("gaoqi198@163.com");
        simpleMailMessage.setFrom("turbo10240@163.com");
        javaMailSender.send(simpleMailMessage);
    }
}
