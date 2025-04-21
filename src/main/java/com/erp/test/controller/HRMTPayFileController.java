package com.erp.test.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import com.erp.test.service.HRMTPayFileService;

@RestController
@RequestMapping("/pay")
public class HRMTPayFileController {
	
	@Autowired
	private HRMTPayFileService hrmtpayfileserv;
	
	@GetMapping("/by-month/{date}")
	public ResponseEntity <Long> gettotPayByMonthWise(@PathVariable ("date") Date date)
		{
			Long result = hrmtpayfileserv.getTotPayByMonth(date);
			if(result == null) 
			{
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(0L);
			}
			else 
			{
				return ResponseEntity.ok(result);
			}
	}
	
	

}
