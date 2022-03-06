package com.ashu.practice.graphql.service;

import com.ashu.practice.graphql.dto.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeService {

    public List<Employee> getAllEmployees() {
        return List.of(new Employee("1", "Andi"));
    }

}