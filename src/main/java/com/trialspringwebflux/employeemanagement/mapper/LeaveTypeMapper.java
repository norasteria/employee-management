package com.trialspringwebflux.employeemanagement.mapper;

import com.trialspringwebflux.employeemanagement.dto.LeaveTypeResponseDTO;
import com.trialspringwebflux.employeemanagement.model.LeaveTypeModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class LeaveTypeMapper {

    public Mono<LeaveTypeResponseDTO> mapToDTO(LeaveTypeModel leaveTypeModel){
        return Mono.just(LeaveTypeResponseDTO
                .builder()
                .id(leaveTypeModel.getId())
                .name(leaveTypeModel.getName())
                .quantity(leaveTypeModel.getQuantity())
                .build());
    }
}
