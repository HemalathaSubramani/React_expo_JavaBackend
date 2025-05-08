package com.erp.test.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.test.repository.ADVTCollectionHeaderRepository;

@Service
public class ADVTCollectionHeaderService {
	
	@Autowired
	private ADVTCollectionHeaderRepository advtColl;
	
	public Long getTotalAmount(Date date) {
		return advtColl.getTotalAmount(date);
	}

}
