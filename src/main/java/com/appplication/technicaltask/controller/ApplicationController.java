package com.appplication.technicaltask.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.appplication.technicaltask.dto.EmployeeInputDto;
import com.appplication.technicaltask.dto.EmployeeResponseDto;
import com.appplication.technicaltask.model.Employee;
import com.appplication.technicaltask.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ApplicationController {

    private final EmployeeRepository employeeRepository;

    @PostMapping("api/v1/employee")
    @ResponseBody
    public EmployeeResponseDto addEmployee(@RequestBody EmployeeInputDto employeeInputDto){
        Employee newEmployee = new Employee(employeeInputDto.getFirstName(), employeeInputDto.getLastName(), employeeInputDto.getTitle(),
            employeeInputDto.getDateOfBirth(), employeeInputDto.getGender(), employeeInputDto.getEmail(), employeeInputDto.getAddress());

        newEmployee = employeeRepository.save(newEmployee);

        return new EmployeeResponseDto(newEmployee.getEmployeeId(), newEmployee.getFirstName(), newEmployee.getLastName(), newEmployee.getEmail());
    }
}
