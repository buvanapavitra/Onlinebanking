package com.pod3.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;

import com.pod3.onlinebanking.entity.PrimaryAccount;


public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount, Long> {

    PrimaryAccount findByAccountNumber(int accountNumber);
}