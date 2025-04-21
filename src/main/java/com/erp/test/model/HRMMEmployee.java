package com.erp.test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class HRMMEmployee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String mempid;
	
	

}
