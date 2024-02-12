package com.trialspringwebflux.employeemanagement.dto;


import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LeaveTypeResponseDTO {

    private UUID id;

    private String name;

    private Integer quantity;
}
