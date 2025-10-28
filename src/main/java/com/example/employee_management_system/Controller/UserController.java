package com.example.employee_management_system.Controller;

import com.example.employee_management_system.Models.Employee;
import com.example.employee_management_system.Models.User;
import com.example.employee_management_system.Service.EmployeeService;
import com.example.employee_management_system.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAll();
    }

    @GetMapping("/me")
    public String getLoggedInUser(Principal principal) {
        return "Logged in as: " + principal.getName();
    }
}
