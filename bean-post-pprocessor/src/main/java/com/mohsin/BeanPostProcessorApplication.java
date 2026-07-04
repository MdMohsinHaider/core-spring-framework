package com.mohsin;

import com.mohsin.beans.Rocket;
import com.mohsin.config.BeanPostProcessorConfig;
import com.mohsin.utils.InstanceTracker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * bean post processor
 */
public class BeanPostProcessorApplication {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanPostProcessorConfig.class);
        System.out.println("instances count: "+InstanceTracker.getCounter()); // instances count 3

        context.getBean(Rocket.class);
        System.out.println("instances count: "+InstanceTracker.getCounter()); // instances count 4
    }
}
