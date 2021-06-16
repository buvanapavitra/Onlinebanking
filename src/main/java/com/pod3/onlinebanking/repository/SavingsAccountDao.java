package com.pod3.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;

import com.pod3.onlinebanking.entity.SavingsAccount;


public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

    SavingsAccount findByAccountNumber(int accountNumber);
}