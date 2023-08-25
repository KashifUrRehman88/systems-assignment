package com.systemsinc.sdmanager.controller;

import com.systemsinc.sdmanager.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * API to Set Report to Assignee
 * @author Kashif Ur Rehman
 */
@RestController
@RequestMapping("/api/reports")
public class ReportController {
    @Autowired
    private ReportService reportService;

    @PostMapping("/{reportId}/assign")
    public ResponseEntity<String> assignReport(
            @PathVariable Long reportId,
            @RequestParam String assignee) {
        reportService.assignReport(reportId, assignee);
        return ResponseEntity.ok("Report Assigned Successfully");
    }

}
