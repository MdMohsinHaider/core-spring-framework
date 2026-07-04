package com.mohsin.nls.reader;

import java.io.*;
import java.nio.charset.Charset;

public class I18NMessageReader {

    public void printMessage() throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(
                new FileInputStream("D:\\DurgaSoft\\SPRING FRAMEWORK WITH SPRING BOOT BY SRIMAN SIR\\springcore\\i18n-nls\\src\\main\\resources\\message.txt"),
                Charset.forName("UTF-8")
        ));

        String line = null;
        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }
    }
}