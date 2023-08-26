package com.systemsinc.sdmanager.service;

import com.systemsinc.sdmanager.model.Ticket;
import com.systemsinc.sdmanager.repository.TicketRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketDistributionService {

    @Autowired
    private TicketRepository ticketRepository;

    public void distributeTickets(List<Long> ticketIds, List<String> assignees) {
        List<Ticket> tickets = ticketRepository.findAllById(ticketIds);
        if (tickets.size() != ticketIds.size()) {
            throw new EntityNotFoundException("Some tickets not found");
        }

        if (tickets.size() > assignees.size()) {
            throw new IllegalArgumentException("Insufficient assignees");
        }

        // Distribute tickets among assignees
        int ticketsPerAssignee = tickets.size() / assignees.size();
        int remainingTickets = tickets.size() % assignees.size();

        int ticketIndex = 0;
        for (String assignee : assignees) {
            int ticketsToAssign = ticketsPerAssignee + (remainingTickets > 0 ? 1 : 0);
            remainingTickets--;

            for (int i = 0; i < ticketsToAssign; i++) {
                Ticket ticket = tickets.get(ticketIndex++);
                ticket.setStatus(assignee);
                ticketRepository.save(ticket);
            }
        }
    }
}
