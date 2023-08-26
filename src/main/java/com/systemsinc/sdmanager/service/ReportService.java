package com.systemsinc.sdmanager.service;

import com.systemsinc.sdmanager.model.Report;
import com.systemsinc.sdmanager.repository.ReportRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Kashif Ur Rehman
 */
@Service
public class ReportService {
    @Autowired
    private ReportRepository reportRepository;

    public void assignReport(Long reportId, String assignee) {
        Report report = reportRepository.findById(reportId)
                .orElseThrow(() -> new EntityNotFoundException("Report not found"));
        report.setAssignee(assignee);
        report.setStatus("assigned");
        reportRepository.save(report);
    }
}
