package com.hsbc.hospitalmanagement.services;

import com.hsbc.hospitalmanagement.dtos.EmployeeRequest;
import com.hsbc.hospitalmanagement.models.Employee;
import com.hsbc.hospitalmanagement.models.Person;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EmployeeService {
    boolean addEmployee(EmployeeRequest employeeRequest);
    List<Employee> getAllEmployee();
    Employee getEmployeeById(int employeeCode);
    Employee updateEmployee(long employeeCode , long salary);
    boolean deleteEmployee(long employeeCode);
    Person getPerson(String firstName,String lastName,String dob);

}
