package com.trialspringwebflux.employeemanagement.controller;

import com.trialspringwebflux.employeemanagement.dto.LeaveTypeResponseDTO;
import com.trialspringwebflux.employeemanagement.service.LeaveTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/leave-type")
public class LeaveTypeController {
    private final LeaveTypeService leaveTypeService;

    @GetMapping
    public Mono<List<LeaveTypeResponseDTO>> getAllLeaveType(){
        return this.leaveTypeService.getAllLeaveType();
    }
}
