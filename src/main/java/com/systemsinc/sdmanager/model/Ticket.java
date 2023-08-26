package com.systemsinc.sdmanager.model;

import com.systemsinc.sdmanager.listener.TicketAuditListener;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Kashif Ur Rehman
 */
@Entity
@Getter
@Setter
@ToString
@EntityListeners(TicketAuditListener.class)
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "report_id")
    private Report report;

    private String content;
    private String status;

    @Column(name="technical_feedback")
    private String technicalFeedback;

    @Column(name="created_by")
    private String updatedBy;

    @Column(name="updated_date")
    private LocalDate updatedDate;

    @Transient
    private List<TicketAudit> auditHistory = new ArrayList<>();


}
