package com.mohsin.beans;

public class DateHelper {
    private static DateHelper instance;

    private DateHelper() {
        System.out.println("DateHelper constructor");
    }

    public static synchronized DateHelper getInstance() {
        if (instance == null) {
            instance = new DateHelper();
        }
        return instance;
    }
}
