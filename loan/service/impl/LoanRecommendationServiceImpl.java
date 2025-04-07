package com.example.loan.service.impl;

import com.example.loan.model.Loan;
import com.example.loan.model.User;
import com.example.loan.service.LoanRecommendationService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanRecommendationServiceImpl implements LoanRecommendationService {

    @Override
    public List<Loan> recommendLoan(User user) {
        List<Loan> options = new ArrayList<>();
        double maxAmount = user.getIncome() * 15;

        options.add(new Loan(1, maxAmount, 8.5, 60));
        options.add(new Loan(2, maxAmount * 0.8, 7.0, 36));

        return options;
    }
}
