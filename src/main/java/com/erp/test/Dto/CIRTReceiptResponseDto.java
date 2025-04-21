package com.erp.test.Dto;


public class CIRTReceiptResponseDto {
	private Double trecAmount;
//	private String trecCagId;
    private String commPaymode;
	public CIRTReceiptResponseDto(Double trecAmount, String commPaymode) {
		super();
		this.trecAmount = trecAmount;
//		this.trecCagId = trecCagId;
		this.commPaymode = commPaymode;
	}
	public Double getTrecAmount() {
		return trecAmount;
	}
	public void setTrecAmount(Double trecAmount) {
		this.trecAmount = trecAmount;
	}
//	public String getTrecCagId() {
//		return trecCagId;
//	}
//	public void setTrecCagId(String trecCagId) {
//		this.trecCagId = trecCagId;
//	}
	public String getCommPaymode() {
		return commPaymode;
	}
	public void setCommPaymode(String commPaymode) {
		this.commPaymode = commPaymode;
	}
    

}
