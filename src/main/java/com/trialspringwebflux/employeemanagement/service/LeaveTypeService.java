package com.trialspringwebflux.employeemanagement.service;

import com.trialspringwebflux.employeemanagement.dto.LeaveTypeResponseDTO;
import com.trialspringwebflux.employeemanagement.mapper.LeaveTypeMapper;
import com.trialspringwebflux.employeemanagement.repository.LeaveTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class LeaveTypeService {
    private final LeaveTypeRepository leaveTypeRepository;

    private final LeaveTypeMapper leaveTypeMapper;

    public Mono<List<LeaveTypeResponseDTO>> getAllLeaveType(){
        return this.leaveTypeRepository
                .findAll()
                .flatMap(leaveType -> Flux.just(this.leaveTypeMapper.mapToDTO(leaveType)))
                .collect(Collectors.toList());
    }
}
