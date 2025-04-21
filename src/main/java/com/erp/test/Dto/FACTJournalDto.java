package com.erp.test.Dto;

public class FACTJournalDto {

	private Double tjoddbamt;
	private Double tjodcramt;
	private String mldgcbg;
	
	
	public FACTJournalDto(Double tjoddbamt, Double tjodcramt, String mldgcbg) {
		super();
		this.tjoddbamt = tjoddbamt;
		this.tjodcramt = tjodcramt;
		this.mldgcbg = mldgcbg;
	}
	public Double getTjoddbamt() {
		return tjoddbamt;
	}
	public void setTjoddbamt(Double tjoddbamt) {
		this.tjoddbamt = tjoddbamt;
	}
	public Double getTjodcramt() {
		return tjodcramt;
	}
	public void setTjodcramt(Double tjodcramt) {
		this.tjodcramt = tjodcramt;
	}
	public String getMldgcbg() {
		return mldgcbg;
	}
	public void setMldgcbg(String mldgcbg) {
		this.mldgcbg = mldgcbg;
	}
	
	
}
