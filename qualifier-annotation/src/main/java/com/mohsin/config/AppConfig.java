package com.mohsin.config;

import com.mohsin.beans.Sensor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.mohsin.beans"})
public class AppConfig {

    @Bean
    public Sensor infraSensor(){
        return new Sensor("Infrared");
    }

    @Bean
    public Sensor sonicSensor(){
        return new Sensor("Sonic");
    }
}
