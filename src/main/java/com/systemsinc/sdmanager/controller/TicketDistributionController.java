package com.systemsinc.sdmanager.controller;

import com.systemsinc.sdmanager.dto.TicketDistributionRequest;
import com.systemsinc.sdmanager.service.TicketDistributionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * API and service to assign and distribute the 1000 tickets to multiple assignees.
 * @author Kashif Ur Rehman
 */
@RestController
@RequestMapping("/api/tickets-distribution")
public class TicketDistributionController {

    @Autowired
    private TicketDistributionService ticketDistributionService;


    @PostMapping("/distribute")
    public ResponseEntity<String> distributeTickets(@RequestBody TicketDistributionRequest request) {
        ticketDistributionService.distributeTickets(request.getTicketIds(), request.getAssignees());
        return ResponseEntity.ok("Tickets distributed successfully");
    }
}
