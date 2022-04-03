package com.service;

import com.client.PseudoClient;
import com.entity.Account;
import com.entity.AccountDTO;
import com.entity.Transaction;
import com.entity.TransactionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PseudoService {
    @Autowired
    PseudoClient pseudoClient;

    public ResponseEntity<Account> openAccount(AccountDTO accountDTO) {
        return pseudoClient.openAccount(accountDTO);
    }

    public ResponseEntity<Account> closeAccount(AccountDTO accountDTO) {
        return pseudoClient.closeAccount(accountDTO);
    }

    public ResponseEntity<Transaction> doTransaction(TransactionDTO transactionDTO) {
        return pseudoClient.doTransaction(transactionDTO);
    }
}
