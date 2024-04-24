package com.example.projectt3.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.AssertFalse;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull(message = "Account Number Should be not Null")
    private Integer accountNumber;
    @NotNull(message = "Balance should be not null")
    @Column(columnDefinition = "int not null")
    private Integer balance;
    @AssertFalse
    @Column(columnDefinition = "boolean not null")
    private Boolean isActive;


    @ManyToOne
    @JoinColumn(name = "customer_id ", referencedColumnName = "id")
    @JsonIgnore
    private Customer customer;

}
