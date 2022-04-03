package com.controller;

import com.entity.Account;
import com.entity.AccountDTO;
import com.service.PseudoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    PseudoService pseudoService;

    @PostMapping(value = "client/api/account")
    public ResponseEntity<Account> openAccount(@RequestBody AccountDTO accountDTO) {
        return pseudoService.openAccount(accountDTO);
    }

    @DeleteMapping(value = "client/api/account")
    public ResponseEntity<Account> closeAccount(@RequestBody AccountDTO accountDTO) {
        return pseudoService.closeAccount(accountDTO);
    }
}
