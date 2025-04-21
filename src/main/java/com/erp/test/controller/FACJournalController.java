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

import com.erp.test.Dto.FACTJournalDto;
import com.erp.test.service.FACTJournalService;

@RestController
@RequestMapping("/FAC")
public class FACJournalController {

	@Autowired
	private FACTJournalService facjournserv;
	
	@GetMapping("/journal/{date}")
	public ResponseEntity<List<FACTJournalDto>> getAmountDetailsfromJournal(@PathVariable ("date") Date date){
		
		
		List<FACTJournalDto> result = facjournserv.getJournalDetails(date);
			if(result != null) {
				return ResponseEntity.ok(result);
			}
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
}
