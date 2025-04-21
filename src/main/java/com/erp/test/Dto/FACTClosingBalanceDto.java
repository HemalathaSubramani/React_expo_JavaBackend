package com.erp.test.Dto;


public class FACTClosingBalanceDto {
	
	private String mldgname;
	private Double  balance;
	public FACTClosingBalanceDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FACTClosingBalanceDto(String mldgname, Double balance) {
		super();
		this.mldgname = mldgname;
		this.balance = balance;
	}
	public String getMldgname() {
		return mldgname;
	}
	public void setMldgname(String mldgname) {
		this.mldgname = mldgname;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "FACTClosingBalanceDto [mldgname=" + mldgname + ", balance=" + balance + "]";
	}
	
	

}
