package com.example.task5;

import jdk.jfr.Event;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class EventPublisher {
    private ApplicationEventPublisher applicationEventPublisher;

    public EventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publishAsyncEvent(String message) {
        applicationEventPublisher.publishEvent(new AsyncEvent(this));
    }

    public void publishSyncEvent(String message) {
        applicationEventPublisher.publishEvent(new SyncEvent(this, new Message(message)));
    }

    public void publishTransactionalEvent() {
        applicationEventPublisher.publishEvent(new TransactionEvent(this));
    }
}
