package com.example.projectt3.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "Phone Number Should be not null")
    @Size(min = 10, max = 10, message = "phone number length should be 10 digit")
    @Pattern(regexp = "^(05)[0-9]+$")
    @Column(columnDefinition = "VARCHAR(10) NOT NULL UNIQUE")
    private Integer phoneNumber;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "custamer")
    @PrimaryKeyJoinColumn
    private Employee employee;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "custamer")
    private Set<Account> accounts;




}
