package com.systemsinc.sdmanager.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate;
import java.util.List;

/**
 * @author Kashif Ur Rehman
 */
@Entity
@Getter
@Setter
@ToString
public class Report {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate startDate;
    private LocalDate endDate;
    private String status;
    private String assignee;

    @OneToMany(mappedBy = "report")
    private List<Ticket> tickets;
}
