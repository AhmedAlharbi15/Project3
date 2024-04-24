package com.example.projectt3.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "Username should be not Empty")
    private String username;

    @NotEmpty(message = "Password should be not Empty")
    private String password;
    @NotEmpty(message = "Name should be not Empty")
    private String name;
    @NotEmpty(message = "Email should be not Empty")
    @Email
    private String email;

    private String role;
}
