package com.example.loan.service.impl;

import com.example.loan.model.Loan;
import com.example.loan.service.EMICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class EMICalculatorServiceImpl implements EMICalculatorService {

    @Override
    public double calculateEMI(Loan loan) {
        double P = loan.getPrincipal();
        double R = loan.getInterestRate() / (12 * 100);
        int N = loan.getTenure();

        return (P * R * Math.pow(1 + R, N)) / (Math.pow(1 + R, N) - 1);
    }
}
