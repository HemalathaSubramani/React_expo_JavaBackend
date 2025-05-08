package com.erp.test.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import com.erp.test.service.ADVTDebitCreditNoteService;

@RestController
@RequestMapping("/advt")
public class ADVTDebitCreditNoteController {
	
	@Autowired
	private ADVTDebitCreditNoteService advtCreditServ;
	
	
	@GetMapping("/credit/{date}")
	public ResponseEntity<Long> getCreditAmountTotally(@PathVariable("date") Date date){
		Long creditAmt = advtCreditServ.getTotalCreditAmountByMonth(date);
		if(creditAmt == null || creditAmt == ' ' || creditAmt == 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		else {
			return ResponseEntity.ok(creditAmt);
		}
	}
	

}
