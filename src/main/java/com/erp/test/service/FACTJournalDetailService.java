package com.erp.test.service;

import java.sql.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.test.Dto.FACTClosingBalanceDto;
import com.erp.test.repository.FACTJournalDetailRepository;

@Service
public class FACTJournalDetailService {
	
	@Autowired
	private FACTJournalDetailRepository facjourndet;
	
	public List<FACTClosingBalanceDto> getDailyClosingBal(Date date)
	{
		List<Object[]> bal = facjourndet.getJournalDailyAmounts(date);
		return bal.stream().map(row -> new FACTClosingBalanceDto ((String)row[0], (Double)row[1])).collect(Collectors.toList());
	}

}
