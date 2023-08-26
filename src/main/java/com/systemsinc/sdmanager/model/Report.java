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
    @Column(name="id")
    private Long id;

    @Column(name="start_date")
    private LocalDate startDate;

    @Column(name="end_date")
    private LocalDate endDate;

    private String status;
    private String assignee;

    @OneToMany(mappedBy = "report")
    private List<Ticket> tickets;
}
