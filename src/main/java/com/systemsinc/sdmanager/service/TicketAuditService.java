package com.systemsinc.sdmanager.service;

import com.systemsinc.sdmanager.model.TicketAudit;
import com.systemsinc.sdmanager.repository.TicketAuditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Kashif Ur Rehman
 */
@Service
public class TicketAuditService {

    @Autowired
    private TicketAuditRepository ticketAuditRepository;

    public List<TicketAudit> getTicketHistory(Long ticketId) {
        return ticketAuditRepository.findByTicketIdOrderByUpdatedDateAsc(ticketId);
    }

}
