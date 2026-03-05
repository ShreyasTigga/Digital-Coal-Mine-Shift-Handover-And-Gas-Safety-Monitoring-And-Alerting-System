package com.example.coalmine.service.impl;

import com.example.coalmine.model.ShiftReport;
import com.example.coalmine.repository.ShiftReportRepository;
import com.example.coalmine.service.ShiftReportService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShiftReportServiceImpl implements ShiftReportService {

    private final ShiftReportRepository repository;

    public ShiftReportServiceImpl(ShiftReportRepository repository) {
        this.repository = repository;
    }

    @Override
    public ShiftReport createReport(ShiftReport report) {
        return repository.save(report);
    }

    @Override
    public List<ShiftReport> getAllReports() {
        return repository.findAll();
    }

    @Override
    public ShiftReport getReportById(Long id) {
        return repository.findById(id).orElse(null);
    }
}