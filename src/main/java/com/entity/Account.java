package com.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private boolean status;
    private String currencyList;
}
