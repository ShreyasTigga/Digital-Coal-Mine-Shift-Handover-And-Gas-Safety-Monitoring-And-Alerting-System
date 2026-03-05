package com.example.coalmine.service;

import com.example.coalmine.model.ShiftReport;
import java.util.List;

public interface ShiftReportService {

    ShiftReport createReport(ShiftReport report);

    List<ShiftReport> getAllReports();

    ShiftReport getReportById(Long id);
}