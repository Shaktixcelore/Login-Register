package com.example.loginsignup.loginsignup.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.loginsignup.loginsignup.Dto.EmployeeDTO;
import com.example.loginsignup.loginsignup.Entity.Employee;
import com.example.loginsignup.loginsignup.Repo.EmployeeRepo;
import com.example.loginsignup.loginsignup.Service.EmployeeService;

@Service
public class EmployeeImplementation implements EmployeeService{

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public String addEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee(
            employeeDTO.getEmployeeid(),
            employeeDTO.getEmployeename(),
            employeeDTO.getEmail(),
            this.passwordEncoder.encode(employeeDTO.getPassword())
        );
        employeeRepo.save(employee);
        return employee.getEmployeeName();
    }
}
