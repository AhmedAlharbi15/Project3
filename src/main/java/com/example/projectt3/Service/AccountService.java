package com.example.projectt3.Service;

import com.example.projectt3.Repository.AccountRepository;
import com.example.projectt3.Repository.CustomerRepository;
import com.example.projectt3.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {
    private final AccountRepository accountRepository;
    private final CustomerRepository customerRepository;
    private final UserRepository userRepository;
}
