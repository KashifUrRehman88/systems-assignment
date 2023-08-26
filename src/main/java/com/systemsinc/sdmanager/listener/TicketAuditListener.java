package com.systemsinc.sdmanager.listener;

import com.systemsinc.sdmanager.model.Ticket;
import com.systemsinc.sdmanager.model.TicketAudit;
import com.systemsinc.sdmanager.repository.TicketAuditRepository;
import jakarta.persistence.PreUpdate;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

/**
 * @author Kashif Ur Rehman
 */
public class TicketAuditListener {

    @Autowired
    private TicketAuditRepository ticketAuditRepository;
    @PreUpdate
    public void onUpdate(Ticket ticket) {
        TicketAudit auditEntry = new TicketAudit();
        auditEntry.setTicketId(ticket.getId());
        auditEntry.setStatus(ticket.getStatus()); // Set the new status
        auditEntry.setUpdatedDate(LocalDateTime.now()); // Assuming you have imported LocalDateTime
        // Set other audit fields as needed

        ticketAuditRepository.save(auditEntry);
    }
}
