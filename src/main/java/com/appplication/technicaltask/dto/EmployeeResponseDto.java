package com.appplication.technicaltask.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class EmployeeResponseDto {
    Long employeeNumber;
    String firstName;
    String lastName;
    String email;
}
