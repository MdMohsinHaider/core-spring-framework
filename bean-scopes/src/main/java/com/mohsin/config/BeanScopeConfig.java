package com.mohsin.config;

import com.mohsin.beans.DateHelper;
import com.mohsin.beans.Television;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.mohsin.beans")
public class BeanScopeConfig {

    @Bean
    @Scope("singleton")
    public Television ledTelevision(){
        return new Television();
    }

    @Bean
    @Scope("prototype")
    public Television _4kTelevision(){
        return new Television();
    }

    @Bean
    @Scope("prototype")
    public DateHelper dateHelper(){
        System.out.println("dateHelper()");
        return DateHelper.getInstance();
    }
}
