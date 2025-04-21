package com.erp.test.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erp.test.Dto.FACTClosingBalanceDto;
import com.erp.test.service.FACTJournalDetailService;

@RestController
@RequestMapping("/fac")
public class FACClosingBalController {

	@Autowired
	private FACTJournalDetailService journdetSer;
	
	@GetMapping("/bal/{date}")
	public ResponseEntity<List<FACTClosingBalanceDto>> getDailyBalance(@PathVariable("date") Date date)
	{
		try {
			List<FACTClosingBalanceDto> result = journdetSer.getDailyClosingBal(date);
			if(result != null)
			{
				return ResponseEntity.ok(result);
			}
			
		}
		catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}
}
