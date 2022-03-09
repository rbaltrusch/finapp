package com.rbaltrusch.finapp.service;

import com.rbaltrusch.finapp.domain.Status;
import com.rbaltrusch.finapp.domain.Transaction;
import com.rbaltrusch.finapp.repo.TransactionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class TransactionService {

    private TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @PostMapping
    public Transaction createTransaction() {
        Transaction transaction = Transaction.builder().status(Status.Submitted).build();
        return transactionRepository.save(transaction);
    }
}
