package com.springreact.reactspring.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springreact.reactspring.models.Transactions;


@Repository
public interface TransactionsRepo extends JpaRepository<Transactions,Integer>{
    
    
}
