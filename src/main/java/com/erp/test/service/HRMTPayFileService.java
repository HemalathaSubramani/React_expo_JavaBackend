package com.erp.test.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.test.repository.HRMTPayFileRepository;

@Service
public class HRMTPayFileService {
	
	@Autowired
	private HRMTPayFileRepository hrmtpayfilerepo;
	
	public Long getTotPayByMonth(Date date) {
		return hrmtpayfilerepo.getPayByMonthWise(date);
	}
	
}
