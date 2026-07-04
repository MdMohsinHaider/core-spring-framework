package com.mohsin;

import com.mohsin.beans.ReportManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AwareInterfaceApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.mohsin.beans");
        ReportManager reportManager = context.getBean("reportManager", ReportManager.class);
        reportManager.generateReport("sales-report");
    }
}
