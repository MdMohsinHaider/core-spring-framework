package com.mohsin;

import com.mohsin.beans.ConnectionManager;
import com.mohsin.config.BeanFactoryPostProcessorConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Bean Factory Post Processor Application
 */
public class BeanFactoryPostProcessorApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanFactoryPostProcessorConfig.class);
        ConnectionManager connectionManager = applicationContext.getBean("connectionManager", ConnectionManager.class);
        System.out.println(connectionManager);
    }
}
