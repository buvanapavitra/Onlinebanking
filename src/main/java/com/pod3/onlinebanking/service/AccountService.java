package com.pod3.onlinebanking.service;

import java.security.Principal;

import com.pod3.onlinebanking.entity.PrimaryAccount;
import com.pod3.onlinebanking.entity.SavingsAccount;


public interface AccountService {

    PrimaryAccount createPrimaryAccount();

    SavingsAccount createSavingsAccount();

    void deposit(String accountType, double amount, Principal principal);

    void withdraw(String accountType, double amount, Principal principal);

}