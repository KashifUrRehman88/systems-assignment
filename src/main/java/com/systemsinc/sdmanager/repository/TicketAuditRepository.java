package com.systemsinc.sdmanager.repository;

import com.systemsinc.sdmanager.model.TicketAudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Kashif Ur Rehman
 */
@Repository
public interface TicketAuditRepository extends JpaRepository<TicketAudit, Long> {
    List<TicketAudit> findByTicketIdOrderByUpdatingDateAsc(Long ticketId);
}
