package com.mohsin.sp.pattern;

public class DateHelper {

    private static DateHelper instance;

    private DateHelper() {
        // make constructor private
        // not accessable
    }

    public static synchronized DateHelper getInstance() {
        if (instance == null) {
            instance = new DateHelper();
        }
        return instance;
    }
}
