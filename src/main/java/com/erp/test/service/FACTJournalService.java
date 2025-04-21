package com.erp.test.service;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.test.Dto.FACTJournalDto;
import com.erp.test.repository.FACTJournalHeaderRepository;

@Service
public class FACTJournalService {
	@Autowired
	private FACTJournalHeaderRepository facjournrepo;
	
	public List<FACTJournalDto> getJournalDetails(Date date){
		List<Object[]> results = facjournrepo.getDebitAndCreditAmount(date);
		return results.stream().map(row -> new FACTJournalDto((Double) row[0], (Double) row[1], (String) row[2])).collect(Collectors.toList());
	}

}
