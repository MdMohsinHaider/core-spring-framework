package com.mohsin.beans.impl;

import com.mohsin.beans.ReportGenerator;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class PdfReportGeneratorImp implements ReportGenerator {
    private String reportName;
    private Map<String, Object> reportData;


    @Override
    public void writeReport() {
        System.out.println("Writing report: "+reportName);
        reportData.forEach((s,o)->{
            System.out.println(s+" : "+o);
        });
    }

    @Override
    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    @Override
    public void setReportData(Map<String, Object> reportData) {
        this.reportData = reportData;
    }
}
