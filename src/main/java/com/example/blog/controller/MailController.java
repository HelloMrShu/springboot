package com.example.blog.controller;

import com.example.blog.service.MailService;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class MailController {

    public final MailService mailService;

    public MailController(MailService mailService) {
        this.mailService = mailService;
    }

    @GetMapping("/mail/send")
    public boolean send() {
        try {
            this.mailService.send("1");
            return true;
        } catch (Exception e) {
            log.info(e.getMessage());
            return false;
        }
    }
}
