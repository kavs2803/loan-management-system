package com.example.loan.service.impl;

import com.example.loan.service.BankAPIService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class BankAPIServiceImpl implements BankAPIService {

    @Override
    public Map<String, Double> fetchInterestRates() {
        Map<String, Double> rates = new HashMap<>();
        rates.put("Home Loan", 8.25);
        rates.put("Car Loan", 9.5);
        rates.put("Education Loan", 7.0);
        return rates;
    }
}
