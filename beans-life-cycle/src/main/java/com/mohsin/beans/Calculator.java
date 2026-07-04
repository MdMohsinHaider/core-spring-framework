package com.mohsin.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


// .............................................-----1-----..................................
// 1st aproch
/*
@Component
public class Calculator implements InitializingBean, DisposableBean {
    private int a;
    private int b;
    private int sum;

    public Calculator(@Value("${calc.b}") int b){
        this.b = b;
    }

    @Value("${calc.a}")
    public void setA(int a){
        this.a = a;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "a=" + a +
                ", b=" + b +
                ", sum=" + sum +
                '}';
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        this.sum = this.a + this.b; // post-constructor opration
    }


    @Override
    public void destroy() throws Exception {
        this.a = 0;
        this.b = 0;
        this.sum = 0;
        System.out.println("Destroying");
    }
}
 */

// ...........................................----2---.........................................

// second aproch by using annotation which is come from dependancy(Jakarta Annotations API » 3.0.0)
@Component
public class Calculator{
    private int a;
    private int b;
    private int sum;

    public Calculator(@Value("${calc.b}") int b){
        this.b = b;
    }

    @PostConstruct
    public void init(){
        this.sum = this.a + this.b;
    }

    @Value("${calc.a}")
    public void setA(int a){
        this.a = a;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "a=" + a +
                ", b=" + b +
                ", sum=" + sum +
                '}';
    }

    @PreDestroy
    public void cleanUp(){
        this.a = 0;
        this.b = 0;
        this.sum = 0;
        System.out.println("cleanUp .....");
    }

}

