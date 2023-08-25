package com.systemsinc.sdmanager.repository;


import com.systemsinc.sdmanager.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Kashif Ur Rehman
 */
@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
