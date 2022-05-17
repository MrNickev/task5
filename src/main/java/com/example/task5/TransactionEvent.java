package com.example.task5;

import org.springframework.context.ApplicationEvent;
//import org.springframework.transaction.annotation.Transactional;

//@Transactional
public class TransactionEvent extends ApplicationEvent {

    private static int count = 0;

    public TransactionEvent(Object source) {
        super(source);
    }

    public void makeTransaction() {
        count++;
        if (count < 2) {
            System.out.println("Transaction complete " + count + " of 1");
        }
        else throw new IllegalArgumentException("It's impossible to make a transaction.");
    }
}
