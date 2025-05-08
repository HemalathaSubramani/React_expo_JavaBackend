package com.erp.test.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.test.service.ADVTCollectionHeaderService;

@RestController
@RequestMapping("/advt")
public class ADVTCollectionHeaderContoller {
	
	@Autowired
	private ADVTCollectionHeaderService advtcolServ;
	
	@SuppressWarnings("null")
	@GetMapping("/coll/{date}")
	private ResponseEntity<Long> getCollectionAmount(@PathVariable("date") Date date){
		Long total = advtcolServ.getTotalAmount(date);
		if(total == null || total == 0 || total == ' ') {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return ResponseEntity.ok(total);
	}
}
