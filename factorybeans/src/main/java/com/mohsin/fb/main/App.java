package com.mohsin.fb.main;

import com.mohsin.fb.beans.SmartCamera;
import com.mohsin.fb.config.FBConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(FBConfig.class);

        SmartCamera smartCamera = context.getBean("smartCamera",SmartCamera.class);
        smartCamera.detectMotion();
    }
}
