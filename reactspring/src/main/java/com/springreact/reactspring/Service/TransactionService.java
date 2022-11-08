package com.springreact.reactspring.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.springreact.reactspring.Respository.TransferRepo;
import com.springreact.reactspring.Respository.UserRep;

@Service
public class TransactionService {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	TransferRepo transferRepo;
	
	@Autowired
	UserRep userRep;
	
	public void filterTransactions(String id) {
		
	
		
	}
	
}
