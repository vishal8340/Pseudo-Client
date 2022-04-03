package com.client;

import com.entity.Account;
import com.entity.AccountDTO;
import com.entity.Transaction;
import com.entity.TransactionDTO;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "secure-pseudo-service")
@LoadBalancerClient(name = "secure-pseudo-service")
public interface PseudoClient {

    @PostMapping(value = "/api/account")
    ResponseEntity<Account> openAccount(@RequestBody AccountDTO accountDTO);

    @DeleteMapping(value = "/api/account")
    ResponseEntity<Account> closeAccount(@RequestBody AccountDTO accountDTO);

    @PostMapping(value = "/api/transaction")
    ResponseEntity<Transaction> doTransaction(@RequestBody TransactionDTO transactionDTO);
}
