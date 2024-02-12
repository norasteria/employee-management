package com.trialspringwebflux.employeemanagement.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table("leave_type")
public class LeaveTypeModel {

    @Id
    private UUID id;

    private String name;

    private Integer quantity;
}
