package demo.service;

import demo.domain.Order;

public class Email {

    private static Email instance;

    public Email() {}

    public static Email getInstance() {
        if(instance == null) {
            instance = new Email();
        }
        return instance;
    }

    void sendEmail(Order order) {
        // implementation goes here
        throw new RuntimeException();
    }

    boolean sendEmail(Order order, String cc) {
        // implementation goes here
        return true;
    }
}
