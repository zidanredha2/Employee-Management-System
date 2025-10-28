package com.example.employee_management_system.Controller;

import com.example.employee_management_system.Models.Employee;
import com.example.employee_management_system.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @GetMapping
    public List<Employee> getAllUsers() {
        return employeeService.getAll();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    public Employee addUser(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/{id}")
    public Employee updateUser(@PathVariable Long id, @RequestBody Employee employee) {
        Employee existingEmployee = employeeService.getEmployeeById(id);
        if (existingEmployee != null) {
            existingEmployee.setName(employee.getName());
            existingEmployee.setId(employee.getId());
            existingEmployee.setDepartment(employee.getDepartment());
            return employeeService.addEmployee(existingEmployee);
        }
        return null;
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public void deleteUser(@RequestParam Long id) {
        employeeService.deleteEmployee(id);
    }
}
