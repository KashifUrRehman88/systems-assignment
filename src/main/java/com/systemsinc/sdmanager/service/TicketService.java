package com.systemsinc.sdmanager.service;

import com.systemsinc.sdmanager.model.Ticket;
import com.systemsinc.sdmanager.repository.TicketRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Kashif Ur Rehman
 */
@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public void updateTicketStatus(Long ticketId, String status) {
        Ticket ticket = ticketRepository.findById(ticketId)
                .orElseThrow(() -> new EntityNotFoundException("Ticket not found"));
        ticket.setStatus(status);
        ticketRepository.save(ticket);
    }

    public Ticket getTicket(Long ticketId) {
        return ticketRepository.findById(ticketId)
                .orElseThrow(() -> new EntityNotFoundException("Ticket not found"));
    }

    public Ticket createTicket(Ticket ticket) {
        // Set default values or perform validation as needed
        return ticketRepository.save(ticket);
    }

    public Ticket updateTicket(Long ticketId, Ticket updatedTicket) {
        Ticket existingTicket = getTicket(ticketId);
        // Update fields from updatedTicket to existingTicket
        // Return the updated ticket
        return ticketRepository.save(existingTicket);
    }

    public void deleteTicket(Long ticketId) {
        Ticket ticket = getTicket(ticketId);
        ticketRepository.delete(ticket);
    }
}
