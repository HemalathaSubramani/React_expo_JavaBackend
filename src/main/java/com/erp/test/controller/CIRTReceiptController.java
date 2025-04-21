package com.erp.test.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.erp.test.Dto.CIRTReceiptResponseDto;
import com.erp.test.service.CIRTReceiptService;

@RestController
@RequestMapping("/receipts")
public class CIRTReceiptController {
	
	@Autowired
	private CIRTReceiptService receiptServ;
	
	@GetMapping("/by-date")
	public ResponseEntity <List<CIRTReceiptResponseDto>> getReceiptsByPayDate(@RequestParam("date") @DateTimeFormat(pattern="yyyy-MM-dd")Date date)
	{
		List<CIRTReceiptResponseDto> receipts = receiptServ.getReceiptsByPayDate(date);
		return ResponseEntity.ok(receipts);
	}
}
