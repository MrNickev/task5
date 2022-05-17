package com.example.task5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class Task5Application {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext("event_task");
        var publisher = context.getBean(EventPublisher.class);
        publisher.publishSyncEvent("It's sync event");
        publisher.publishTransactionalEvent();
        publisher.publishTransactionalEvent();
    }

}
