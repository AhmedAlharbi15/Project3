package com.example.projectt3.Service;

import com.example.projectt3.Repository.EmployeeRepository;
import com.example.projectt3.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final UserRepository userRepository;
}
