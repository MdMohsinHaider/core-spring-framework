package com.mohsin.beans;

public class MessageWriter {
    private IMessageProducer messageProducer;

    public void writeMessage(final String message) {
        String cMassage = messageProducer.convert(message);
        System.out.println("cMassage = " + cMassage);
    }

    public void setMessageProducer(IMessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }
}
