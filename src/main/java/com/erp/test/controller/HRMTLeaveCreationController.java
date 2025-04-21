package com.erp.test.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.erp.test.service.HRMTLeaveCreationService;

@RestController
@RequestMapping("/leave")
public class HRMTLeaveCreationController {
	
	@Autowired
	private HRMTLeaveCreationService hrmleaveServ;
	
	@SuppressWarnings("null")
	@GetMapping("/by-date/{date}")
	public ResponseEntity<Long> getleaveCountByDate(@PathVariable("date") Date date) {
		Long Count = hrmleaveServ.getCountByDate(date);
		if(Count == null && Count == 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return ResponseEntity.ok(Count);
	}

}
