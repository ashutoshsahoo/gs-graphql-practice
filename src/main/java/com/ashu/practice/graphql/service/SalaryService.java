package com.ashu.practice.graphql.service;

import com.ashu.practice.graphql.dto.Employee;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class SalaryService {


    @PreAuthorize("hasRole('ADMIN')")
    public BigDecimal getSalaryForEmployee(Employee employee) {
        return new BigDecimal("42");
    }

    @Secured({"ROLE_HR"})
    public void updateSalary(String employeeId, BigDecimal newSalary) {

    }
}