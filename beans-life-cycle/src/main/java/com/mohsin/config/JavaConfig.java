package com.mohsin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.mohsin.beans"})
@PropertySource("classpath:app.properties")
public class JavaConfig {}