package com.mohsin.nls.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MessageReader {
    public void printMessage() throws IOException {
        FileInputStream fis = new  FileInputStream(new File("D:\\DurgaSoft\\SPRING FRAMEWORK WITH SPRING BOOT BY SRIMAN SIR\\springcore\\i18n-nls\\src\\main\\resources\\message.txt"));
        int c = 0;
        while ((c = fis.read()) != -1) {
            System.out.print((char)c);
        }
    }
}
