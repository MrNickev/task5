package com.example.task5;

import org.springframework.context.ApplicationEvent;

public class AsyncEvent extends ApplicationEvent {

    public AsyncEvent(Object source) {
        super(source);
    }

    private void create() {
        System.out.println("Async event was created!");
    }

    public String getStatus() {
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "All OK";
    }



}
