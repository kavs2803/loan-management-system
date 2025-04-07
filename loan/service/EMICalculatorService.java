package com.example.loan.service;

import com.example.loan.model.Loan;

public interface EMICalculatorService {
    double calculateEMI(Loan loan);
}
