package com.trialspringwebflux.employeemanagement.repository;

import com.trialspringwebflux.employeemanagement.model.LeaveTypeModel;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;

public interface LeaveTypeRepository extends ReactiveCrudRepository<LeaveTypeModel, UUID> {
}
