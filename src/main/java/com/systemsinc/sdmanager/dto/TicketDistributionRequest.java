package com.systemsinc.sdmanager.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * This is the DTO used for Ticket Distribution:
 * @author Kashif Ur Rehman
 */
@Getter
@Setter
@ToString
public class TicketDistributionRequest {

    private List<Long> ticketIds;
    private List<String> assignees;

}
