package com.mohsin.beans.impl;

import com.mohsin.beans.IMessageProducer;

public class HTMLMessageProducerImpl implements IMessageProducer {
    @Override
    public String convert(String message) {
        return "<html>" +
                    "<body>" + message + "</body>" +
                "</html>";
    }
}
