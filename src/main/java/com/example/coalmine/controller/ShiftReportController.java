package com.example.coalmine.controller;

import com.example.coalmine.model.ShiftReport;
import com.example.coalmine.service.ShiftReportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shift-reports")
public class ShiftReportController {

    private final ShiftReportService service;

    public ShiftReportController(ShiftReportService service) {
        this.service = service;
    }

    @PostMapping
    public ShiftReport createReport(@RequestBody ShiftReport report) {
        return service.createReport(report);
    }

    @GetMapping
    public List<ShiftReport> getAllReports() {
        return service.getAllReports();
    }

    @GetMapping("/{id}")
    public ShiftReport getReportById(@PathVariable Long id) {
        return service.getReportById(id);
    }
}
