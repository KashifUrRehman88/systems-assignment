package com.systemsinc.sdmanager.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class TicketAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Long ticketId;

    private String content;
    private String status;

    @Column(name="updated_by")
    private String updatedBy;

    @Column(name="updated_date")
    private LocalDateTime updatedDate;
}
