package com.example.employee_management_system.Service;

import com.example.employee_management_system.Models.Employee;
import com.example.employee_management_system.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }
    public Employee addEmployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }
}
