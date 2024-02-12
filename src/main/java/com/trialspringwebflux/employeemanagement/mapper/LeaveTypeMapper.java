package com.trialspringwebflux.employeemanagement.mapper;

import com.trialspringwebflux.employeemanagement.dto.LeaveTypeResponseDTO;
import com.trialspringwebflux.employeemanagement.model.LeaveTypeModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LeaveTypeMapper {

    public LeaveTypeResponseDTO mapToDTO(LeaveTypeModel leaveTypeModel){
        return LeaveTypeResponseDTO
                .builder()
                .id(leaveTypeModel.getId())
                .name(leaveTypeModel.getName())
                .quantity(leaveTypeModel.getQuantity())
                .build();
    }
}
