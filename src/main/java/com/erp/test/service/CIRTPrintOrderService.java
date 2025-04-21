package com.erp.test.service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.test.Dto.CIRTPrintOrderDto;
import com.erp.test.repository.CIRTPrintOrderRepository;

@Service
public class CIRTPrintOrderService {

	@Autowired
	private CIRTPrintOrderRepository cirtPrintRepo;
	
	public List<CIRTPrintOrderDto> getCopiesfromdate(Date date){
		
		List<Object[]> result = cirtPrintRepo.findSelectedFieldsByTPORDATE(date);
		return result.stream().map(row -> new CIRTPrintOrderDto((Long) row[0], (Long) row[1])).collect(
				Collectors.toList());
	}
}
