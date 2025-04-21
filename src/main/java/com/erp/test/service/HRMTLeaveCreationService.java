package com.erp.test.service;


import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.test.repository.HRMLeaveCreationRepository;

@Service
public class HRMTLeaveCreationService {
	
	@Autowired
	private HRMLeaveCreationRepository hrmleaverepo;
	
	public Long getCountByDate(Date date) {
		return hrmleaverepo.countAbsenceByDate(date);
	}
}
