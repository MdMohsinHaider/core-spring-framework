package com.mohsin.utils;

import java.util.concurrent.atomic.AtomicInteger;

public class InstanceTracker {
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void incrementCounter(){
        counter.incrementAndGet();
    }

    public static int getCounter(){
        return counter.get();
    }
}
