package com.systemsinc.sdmanager.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDateTime;

/**
 * @author Kashif Ur Rehman
 */
@Entity
@Getter
@Setter
@ToString
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;
    private String status;
    private String technicalFeedback;
    private String updatedBy;
    private LocalDateTime updatingDate;

    @ManyToOne
    @JoinColumn(name = "report_id")
    private Report report;

}
