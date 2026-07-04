package com.mohsin;

import com.mohsin.beans.Student;
import com.mohsin.resources.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        // way 1:
        Object studentObj = context.getBean("student"); // return Student Object
        Student student = (Student) studentObj; // Type cast into Student

        // Way 2:
        Student student1 = context.getBean("student", Student.class);

        // Way 3:
        Student student2 = context.getBean(Student.class);

        // print
        System.out.println("student  "+student);
        System.out.println("student1 "+student1);
        System.out.println("student2 "+student2);
        // print using Stream Api
//        Stream.of(student).forEach(System.out::println);
        
    }
}
