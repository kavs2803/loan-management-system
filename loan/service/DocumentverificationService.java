package com.example.loan.service;

import java.util.List;

public interface DocumentVerificationService {
    boolean verifyDocuments(List<String> documents);
}
