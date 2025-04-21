package com.erp.test.Dto;


public class CIRTPrintOrderDto {
	
//	private String tporid;
	private Long tporcopiestotal;
	private Long tporpostertotal;
	
	public CIRTPrintOrderDto(Long tporcopiestotal, Long tporpostertotal) {
		super();
//		this.tporid = tporid;
		this.tporcopiestotal = tporcopiestotal;
		this.tporpostertotal = tporpostertotal;
	}
	
//	public String getTporid() {
//		return tporid;
//	}
//	public void setTporid(String tporid) {
//		this.tporid = tporid;
//	}
	public Long getTporcopiestotal() {
		return tporcopiestotal;
	}
	public void setTporcopiestotal(Long tporcopiestotal) {
		this.tporcopiestotal = tporcopiestotal;
	}
	public Long getTporpostertotal() {
		return tporpostertotal;
	}
	public void setTporpostaltotal(Long tporpostertotal) {
		this.tporpostertotal = tporpostertotal;
	}
	
	

}
