package com.mohsin;

import com.mohsin.beans.Student;
import com.mohsin.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Spring Annotations | @Component, @Value & @ComponentScan
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student  = context.getBean(Student.class);
        System.out.println(
                "Name: " + student.getName()
                + "\nAge: " + student.getAge()
                + "\nRollno. : " + student.getRollNumber()
                + "\nEmail: "+ student.getEmail()
        );
    }
}
