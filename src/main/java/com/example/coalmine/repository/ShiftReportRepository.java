package com.example.coalmine.repository;

import com.example.coalmine.model.ShiftReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShiftReportRepository extends JpaRepository<ShiftReport, Long> {
}