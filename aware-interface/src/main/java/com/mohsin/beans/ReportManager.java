package com.mohsin.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * ReportManager class is responsible for generating reports.
 *
 * This class implements ApplicationContextAware to get access
 * to Spring Container (ApplicationContext) object.
 *
 * Why ApplicationContextAware?
 * Because we want to manually pull a bean from Spring container
 * using getBean() method.
 *
 * @author Mohsin
 */
@Component  // Marks this class as Spring Bean (Auto-detected via Component Scan)
public class ReportManager implements ApplicationContextAware {

    /**
     * Reference variable to store Spring ApplicationContext object.
     * This gives access to all Spring-managed beans.
     */
    private ApplicationContext applicationContext;

    /**
     * This method generates a report dynamically.
     *
     * FLOW OF EXECUTION:
     * Step 1 -> Get ReportGenerator bean from Spring Container
     * Step 2 -> Set Report Name
     * Step 3 -> Prepare Report Data (Map)
     * Step 4 -> Set Report Data
     * Step 5 -> Call writeReport() method to generate the report
     *
     * @param reportName Name of the report to be generated
     */
    public void generateReport(String reportName){

        // Step 1: Declare reference
        ReportGenerator reportGenerator = null;

        // Step 2: Pull the ReportGenerator bean from Spring Container
        // "pdfReportGeneratorImp" is the bean id/name
        reportGenerator = (ReportGenerator) applicationContext.getBean("pdfReportGeneratorImp");

        // Step 3: Set the report name
        reportGenerator.setReportName(reportName);

        // Step 4: Prepare report data using Java 9 Map.of() method
        // Key = Product Name
        // Value = Price
        Map<String,Object> reportData = Map.of(
                "Laptop",2000,
                "Monitor",3773,
                "headphone",8373,
                "Keybord",9399
        );

        // Step 5: Set report data into ReportGenerator
        reportGenerator.setReportData(reportData);

        // Step 6: Generate / Write the report
        reportGenerator.writeReport();
    }

    /**
     * This method is automatically called by Spring Container.
     *
     * When Spring creates this bean (ReportManager),
     * it injects the ApplicationContext object into this method.
     *
     * This is called Dependency Injection through Aware Interface.
     *
     * @param applicationContext Spring Container object
     * @throws BeansException if any bean-related exception occurs
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}