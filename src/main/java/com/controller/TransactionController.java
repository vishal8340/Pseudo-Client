package com.controller;

import com.entity.Transaction;
import com.entity.TransactionDTO;
import com.service.PseudoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
    @Autowired
    PseudoService pseudoService;

    @PostMapping(value = "client/api/transaction")
    public ResponseEntity<Transaction> doTransaction(@RequestBody TransactionDTO transactionDTO) {
        return pseudoService.doTransaction(transactionDTO);
    }
}
