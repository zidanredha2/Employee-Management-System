package com.example.employee_management_system.Repositories;

import com.example.employee_management_system.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
