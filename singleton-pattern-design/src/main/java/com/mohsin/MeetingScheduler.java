package com.mohsin;

import com.mohsin.sp.runnable.Meeting;

import java.util.stream.IntStream;

/**
 * Hello world!
 */
public class MeetingScheduler {
    public static void main(String[] args) {

        Meeting meeting = new Meeting();
        IntStream.range(0, 10).forEach(i -> {
            new Thread(meeting).start();
        });
    }
}
