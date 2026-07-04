package com.mohsin.main;

import com.mohsin.beans.Calculator;
import com.mohsin.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        /**
         * Jab JVM band ho (application close ho), tab beans ka destroy method call kar dena."
         *
         *
         * ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
         * Ye Spring container ka parent interface hai.Lekin…
         * ApplicationContext me registerShutdownHook() method nahi hota ❌
         *
         *
         * ConfigurableApplicationContext
         * Ye ApplicationContext ka child interface hai.
         * Isme extra lifecycle control methods hote hain:
         *      1. close()
         *      2. registerShutdownHook()
         *      3. refresh()
         *
         * 🎯 registerShutdownHook() kya karta hai?
         * Jab JVM band hoti hai (program finish hota hai), tab automatically:
         *      destroy()
         * call ho jata hai.
         *
         *
         * 🔁 Without registerShutdownHook()
         * Agar ye line hata doge ❌
         * To:
         *      ✔ Constructor chalega
         *      ✔ afterPropertiesSet() chalega
         *      ❌ destroy() nahi chalega
         *
         *
         *
         */
        ((ConfigurableApplicationContext) context).registerShutdownHook();


        Calculator calculator = context.getBean("calculator", Calculator.class);
        System.out.println(calculator);
    }
}
