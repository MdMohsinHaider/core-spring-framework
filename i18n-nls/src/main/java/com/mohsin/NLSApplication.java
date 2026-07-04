package com.mohsin;


import com.mohsin.nls.reader.I18NMessageReader;
import com.mohsin.nls.reader.MessageReader;

import java.io.IOException;
import java.util.Locale;

public class NLSApplication {
    public static void main(String[] args) throws IOException {
        /*
        MessageReader messageReader = new MessageReader();
        messageReader.printMessage();
         */
        /*
        I18NMessageReader reader = new I18NMessageReader();
        reader.printMessage();
         */
        Locale locale = Locale.forLanguageTag("tn-IN");
        System.out.println("locale = " + locale);

//        Locale locale1 = Locale.of(String.valueOf(Locale.CANADA_FRENCH));
//        System.out.println("locale1 = " + locale1);
    }
}
