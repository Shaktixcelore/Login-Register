package com.example.loginsignup.loginsignup.Repo;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.loginsignup.loginsignup.Entity.Employee;

@EnableJpaRepositories
@Repository
public class EmployeeRepo {

    public void save(Employee employee) {
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
    
}
