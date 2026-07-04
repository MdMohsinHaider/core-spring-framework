package com.mohsin.resources;

import com.mohsin.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Student student(){

        return new Student("mohsin",24,28,"mohsin@gmail.com");
    }

}
