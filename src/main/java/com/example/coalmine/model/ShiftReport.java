package com.example.coalmine.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "shift_reports")
public class ShiftReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mineSection;

    private String shift;

    private String supervisorName;

    private String gasLevelCH4;

    private String gasLevelCO;

    private String gasLevelCO2;

    @Column(length = 1000)
    private String hazardsObserved;

    @Column(length = 1000)
    private String equipmentStatus;

    @Column(length = 1000)
    private String pendingWork;

    @Column(length = 1000)
    private String safetyInstructions;

    private LocalDateTime reportTime;

    public ShiftReport() {
        this.reportTime = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public String getMineSection() {
        return mineSection;
    }

    public void setMineSection(String mineSection) {
        this.mineSection = mineSection;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }

    public String getGasLevelCH4() {
        return gasLevelCH4;
    }

    public void setGasLevelCH4(String gasLevelCH4) {
        this.gasLevelCH4 = gasLevelCH4;
    }

    public String getGasLevelCO() {
        return gasLevelCO;
    }

    public void setGasLevelCO(String gasLevelCO) {
        this.gasLevelCO = gasLevelCO;
    }

    public String getGasLevelCO2() {
        return gasLevelCO2;
    }

    public void setGasLevelCO2(String gasLevelCO2) {
        this.gasLevelCO2 = gasLevelCO2;
    }

    public String getHazardsObserved() {
        return hazardsObserved;
    }

    public void setHazardsObserved(String hazardsObserved) {
        this.hazardsObserved = hazardsObserved;
    }

    public String getEquipmentStatus() {
        return equipmentStatus;
    }

    public void setEquipmentStatus(String equipmentStatus) {
        this.equipmentStatus = equipmentStatus;
    }

    public String getPendingWork() {
        return pendingWork;
    }

    public void setPendingWork(String pendingWork) {
        this.pendingWork = pendingWork;
    }

    public String getSafetyInstructions() {
        return safetyInstructions;
    }

    public void setSafetyInstructions(String safetyInstructions) {
        this.safetyInstructions = safetyInstructions;
    }

    public LocalDateTime getReportTime() {
        return reportTime;
    }
}