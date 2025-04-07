package com.example.loan.controller;

import com.example.loan.model.User;
import com.example.loan.service.LoanEligibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/loan")
public class LoanController {

    @Autowired
    private LoanEligibilityService eligibilityService;

    @PostMapping("/check-eligibility")
    public boolean checkEligibility(@RequestBody User user) {
        return eligibilityService.checkEligibility(user);
    }

    @PostMapping("/max-loan")
    public double getMaxLoan(@RequestBody User user) {
        return eligibilityService.calculateMaxLoan(user);
    }
}
