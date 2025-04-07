package com.example.loan.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanId;

    private double principal;
    private double interestRate;
    private int tenure; // in months

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
