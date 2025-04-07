package com.example.loan.service;

import com.example.loan.model.User;

public interface LoanEligibilityService {
    boolean checkEligibility(User user);
    double calculateMaxLoan(User user);
}
