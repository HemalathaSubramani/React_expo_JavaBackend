package com.erp.test.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.test.repository.ADVTDebitCreditNoteRepository;

@Service
public class ADVTDebitCreditNoteService {
	
	@Autowired
	private ADVTDebitCreditNoteRepository advtCrdtRepo;
	
	public Long getTotalCreditAmountByMonth(Date date) {
		return advtCrdtRepo.getCreditAmountByMonth(date);
	}

}
