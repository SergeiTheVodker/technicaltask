package com.appplication.technicaltask.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appplication.technicaltask.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{ }
