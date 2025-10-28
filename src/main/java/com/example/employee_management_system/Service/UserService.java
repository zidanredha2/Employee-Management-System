package com.example.employee_management_system.Service;

import com.example.employee_management_system.Models.User;
import com.example.employee_management_system.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
