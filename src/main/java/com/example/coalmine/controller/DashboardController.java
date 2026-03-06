package com.example.coalmine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/admin")
    public String adminDashboard() {
        return "admin-dashboard";
    }

    @GetMapping("/supervisor")
    public String supervisorDashboard() {
        return "supervisor-dashboard";
    }

    @GetMapping("/gas-officer")
    public String gasDashboard() {
        return "gasofficer-dashboard";
    }

    @GetMapping("/safety-officer")
    public String safetyDashboard() {
        return "safety-dashboard";
    }
}