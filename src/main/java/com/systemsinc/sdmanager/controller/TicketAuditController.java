package com.systemsinc.sdmanager.controller;

import com.systemsinc.sdmanager.model.TicketAudit;
import com.systemsinc.sdmanager.service.TicketAuditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * API to View Ticket History via API
 * @author Kashif Ur Rehman
 */
@RequestMapping("/api/ticket-audit")
public class TicketAuditController {

    @Autowired
    private TicketAuditService ticketAuditService;

    /**
     *  Audit Updates on Tickets and View History via API
     * @param ticketId
     * @return
     */
    @GetMapping("/{ticketId}/history")
    public ResponseEntity<List<TicketAudit>> getTicketHistory(@PathVariable Long ticketId) {
        List<TicketAudit> history = ticketAuditService.getTicketHistory(ticketId);
        return ResponseEntity.ok(history);
    }
}
