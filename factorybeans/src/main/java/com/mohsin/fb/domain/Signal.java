package com.mohsin.fb.domain;

public class Signal {
    private String type;
    private String id;

    public Signal(String type, String id) {
        this.type = type;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }
}
