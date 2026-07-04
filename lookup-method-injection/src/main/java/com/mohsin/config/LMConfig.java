package com.mohsin.config;

import com.mohsin.beans.functionalprogram.IntrafceTaskManager;
import com.mohsin.beans.Task;
import com.mohsin.beans.TaskManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.mohsin.beans"})
public class LMConfig {

    private final ApplicationContext applicationContext;

    public LMConfig(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Bean
    public TaskManager taskManager() {
        return new TaskManager() {
            @Override
            public Task lookupTask() {
                return applicationContext.getBean("notificationTask", Task.class);
            }
        };
    }

    // create beans using functional programming and labdaexpression
    // two
    @Bean
    public IntrafceTaskManager intrafceTaskManager() {
        return () -> applicationContext.getBean("notificationTask", Task.class);
    }
}
