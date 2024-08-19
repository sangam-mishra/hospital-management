package com.hsbc.hospitalmanagement.services;

import com.hsbc.hospitalmanagement.dtos.EmployeeRequest;
import com.hsbc.hospitalmanagement.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Value("${addPerson}")
    private String addPersonQuery;
    @Value("${addEmployee}")
    private String addEmployeeQuery;

    @Override
    public boolean addEmployee(EmployeeRequest employeeRequest) {
        jdbcTemplate.update(addPersonQuery,new Object[] {
                employeeRequest.getFirstName(),
                employeeRequest.getMiddleName(),
                employeeRequest.getLastName(),
               Date.valueOf(employeeRequest.getDob())

        });
        return true;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return List.of();
    }

    @Override
    public Employee getEmployeeById(int employeeCode) {
        return null;
    }

    @Override
    public Employee updateEmployee(long employeeCode, long salary) {
        return null;
    }

    @Override
    public boolean deleteEmployee(long employeeCode) {
        return false;
    }
}
