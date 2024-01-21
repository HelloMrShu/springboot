package com.example.blog.job;

import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class TestJob {

    @Scheduled(cron = "0 * * * * ?")
    @Async
    public void run() {
        try {
            log.info("test cron job");
        } catch (Exception e) {
            log.error(e.toString());
        }
    }
}
