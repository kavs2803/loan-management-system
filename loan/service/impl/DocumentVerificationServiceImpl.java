package com.example.loan.service.impl;

import com.example.loan.service.DocumentVerificationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentVerificationServiceImpl implements DocumentVerificationService {

    @Override
    public boolean verifyDocuments(List<String> documents) {
        return documents != null && documents.size() >= 2; // Simple dummy check
    }
}
