package com.example.loan.service.impl;

import com.example.loan.model.User;
import com.example.loan.service.LoanEligibilityService;
import org.springframework.stereotype.Service;

@Service
public class LoanEligibilityServiceImpl implements LoanEligibilityService {

    @Override
    public boolean checkEligibility(User user) {
        return user.getCreditScore() > 650 && user.getIncome() > user.getExpenses();
    }

    @Override
    public double calculateMaxLoan(User user) {
        return user.getIncome() * 10 - user.getExistingDebts();
    }
}
