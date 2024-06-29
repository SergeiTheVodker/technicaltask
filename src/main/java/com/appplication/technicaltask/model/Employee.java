package com.appplication.technicaltask.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long employeeId;

    String firstName;

    String lastName;

    String title;

    @JsonFormat(pattern="yyyy-MM-dd")
    LocalDate dateOfBirth;

    String gender;

    @Column(unique = true)
    String email;

    String address;
    
    public Employee(String firstName, String lastName, String title, LocalDate dateOfBirth, String gender, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.address = address;
    }
}
