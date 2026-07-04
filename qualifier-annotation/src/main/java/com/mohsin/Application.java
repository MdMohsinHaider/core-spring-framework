package com.mohsin;

import com.mohsin.beans.Robot;
import com.mohsin.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class Application
{
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Robot robot = context.getBean("robot",Robot.class);
        robot.walk();
    }
}
