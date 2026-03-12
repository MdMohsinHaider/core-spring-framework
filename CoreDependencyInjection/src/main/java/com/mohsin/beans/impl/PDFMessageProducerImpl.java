package com.mohsin.beans.impl;

import com.mohsin.beans.IMessageProducer;

public class PDFMessageProducerImpl implements IMessageProducer {
    @Override
    public String convert(String message) {
        return "<pdf>" + message + "</pdf>";
    }
}
