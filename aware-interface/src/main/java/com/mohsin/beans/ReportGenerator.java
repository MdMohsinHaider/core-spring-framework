package com.mohsin.beans;

import java.util.Map;

public interface ReportGenerator {

    void writeReport();
    void setReportName(String reportName);
    void setReportData(Map<String, Object> reportData);
}
