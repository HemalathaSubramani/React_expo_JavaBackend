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

import com.erp.test.Dto.CIRTPrintOrderDto;
import com.erp.test.service.CIRTPrintOrderService;

@RestController
@RequestMapping("/supply")
public class CIRTPrintOrderController {
	
	@Autowired
	private CIRTPrintOrderService cirtposerv;
	
	@GetMapping("/copies")
	public ResponseEntity <List<CIRTPrintOrderDto>> getCopiesfromdate(@RequestParam("date") @DateTimeFormat(pattern="yyyy-MM-dd")Date date){
		List<CIRTPrintOrderDto> supply = cirtposerv.getCopiesfromdate(date);
		return ResponseEntity.ok(supply);
	}
	

}
