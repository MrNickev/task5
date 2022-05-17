package com.example.task5;

import org.springframework.context.ApplicationEvent;

public class SyncEvent extends ApplicationEvent {
    private Message message;

    public SyncEvent(Object source, Message message) {
        super(source);
        this.message = message;
    }


    public String getMessage() {
        return message.getMessage();
    }

    public void create() {
        System.out.println("Sync event was created!");
    }
}
