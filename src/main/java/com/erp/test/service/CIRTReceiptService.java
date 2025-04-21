package com.erp.test.service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.test.Dto.CIRTReceiptResponseDto;
import com.erp.test.repository.CIRTReceiptRepository;

@Service
public class CIRTReceiptService {
	
	@Autowired
	private CIRTReceiptRepository receiptRepo;
	
	public List<CIRTReceiptResponseDto> getReceiptsByPayDate(Date date){
		List<Object[]> results = receiptRepo.findSelectedFieldsByTrecPayDate(date);
		 return results.stream()
                 .map(row -> new CIRTReceiptResponseDto(
                     (Double) row[0],
                     (String) row[1]))
                 .collect(Collectors.toList());// Added closing parenthesis here
}
}
