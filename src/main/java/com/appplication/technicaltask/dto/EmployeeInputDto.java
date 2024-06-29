package com.appplication.technicaltask.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;

@Getter
public class EmployeeInputDto {

    String firstName;

    String lastName;

    String title;

    @JsonFormat(pattern="yyyy-MM-dd")
    LocalDate dateOfBirth;

    String gender;

    String email;
    
    String address;
}
