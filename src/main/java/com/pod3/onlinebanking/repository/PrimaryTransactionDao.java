package com.pod3.onlinebanking.repository;

import org.springframework.data.repository.CrudRepository;

import com.pod3.onlinebanking.entity.PrimaryTransaction;

import java.util.List;


public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}