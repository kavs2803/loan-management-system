package com.example.loan.service;

import java.util.Map;

public interface BankAPIService {
    Map<String, Double> fetchInterestRates();
}
