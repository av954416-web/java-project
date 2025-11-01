package com.carrental.controller;

import org.springframework.web.bind.annotation.*;
import com.carrental.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Map;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {
    
    @Autowired
    private DashboardService dashboardService;

    @GetMapping("/user")
    public Map<String, Object> getUserDashboard(@RequestHeader("Authorization") String token) {
        return dashboardService.getUserDashboard(token);
    }

    @GetMapping("/owner")
    public Map<String, Object> getOwnerDashboard(@RequestHeader("Authorization") String token) {
        return dashboardService.getOwnerDashboard(token);
    }

    @GetMapping("/admin")
    public Map<String, Object> getAdminDashboard(@RequestHeader("Authorization") String token) {
        return dashboardService.getAdminDashboard(token);
    }
}
