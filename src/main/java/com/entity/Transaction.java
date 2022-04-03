package com.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Transaction {
    private int transactionId;
    private String type;
    private double amount;
    private String currency;
    private long accountFrom;
    private Account account;
}
