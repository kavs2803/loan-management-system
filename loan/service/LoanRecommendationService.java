package com.example.loan.service;

import com.example.loan.model.User;
import com.example.loan.model.Loan;

import java.util.List;

public interface LoanRecommendationService {
    List<Loan> recommendLoan(User user);
}
