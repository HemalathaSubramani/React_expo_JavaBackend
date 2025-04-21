package com.erp.test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.*;

@Entity
@Table(name="HRMTLEAVECREATION")
public class HRMTLeaveCreation {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private String tlcrid;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="TLCREMPID")
	private HRMMEmployee hrmmemployee;
//	@ManyToOne
//	@JoinColumn(name="TLCRLTYID")
//	private HRMMLeaveType hrmmleavetypes;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="TLCRUSERNAME")
	private COMMAuthentication commauthentication;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="TLCRBRNID")
	private ComBranch commbranch;
	
	@Column(name="TLCRFROMDATE")
	@Temporal(TemporalType.DATE)
	private  Date tlcrfromdate;
	
	@Column(name="TLCRTODATE")
	@Temporal(TemporalType.DATE)
	private Date tlcrtodate;
	
	@Column(name="TLCRFROMSESSION")
	private String tlcrfromsession;
	
	@Column(name="TLCRTOSESSION")
	private String tlcrtosession;
	
	@Column(name="TLCRREASON")
	private String tlcrreason;
	
	@Column(name="TLCRBMREMARKS")
	private String tlcrbmremarks;
	
	@Column(name = "TLCRSTATUS")
	private String tlcrstatus;
	
	@Column(name="TLCRMODDATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Timestamp tlcrmoddate;
	
	@Column(name="TLCRIP")
	private String tlcrip;
	
	
	public HRMTLeaveCreation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTlcrid() {
		return tlcrid;
	}

	public void setTlcrid(String tlcrid) {
		this.tlcrid = tlcrid;
	}

	public HRMMEmployee getHrmmemployee() {
		return hrmmemployee;
	}

	public void setHrmmemployee(HRMMEmployee hrmmemployee) {
		this.hrmmemployee = hrmmemployee;
	}

	public COMMAuthentication getCommauthentication() {
		return commauthentication;
	}

	public void setCommauthentication(COMMAuthentication commauthentication) {
		this.commauthentication = commauthentication;
	}

	public ComBranch getCommbranch() {
		return commbranch;
	}

	public void setCommbranch(ComBranch commbranch) {
		this.commbranch = commbranch;
	}

	public Date getTlcrfromdate() {
		return tlcrfromdate;
	}

	public void setTlcrfromdate(Date tlcrfromdate) {
		this.tlcrfromdate = tlcrfromdate;
	}

	public Date getTlcrtodate() {
		return tlcrtodate;
	}

	public void setTlcrtodate(Date tlcrtodate) {
		this.tlcrtodate = tlcrtodate;
	}

	public String getTlcrfromsession() {
		return tlcrfromsession;
	}

	public void setTlcrfromsession(String tlcrfromsession) {
		this.tlcrfromsession = tlcrfromsession;
	}

	public String getTlcrtosession() {
		return tlcrtosession;
	}

	public void setTlcrtosession(String tlcrtosession) {
		this.tlcrtosession = tlcrtosession;
	}

	public String getTlcrreason() {
		return tlcrreason;
	}

	public void setTlcrreason(String tlcrreason) {
		this.tlcrreason = tlcrreason;
	}

	public String getTlcrbmremarks() {
		return tlcrbmremarks;
	}

	public void setTlcrbmremarks(String tlcrbmremarks) {
		this.tlcrbmremarks = tlcrbmremarks;
	}

	public String getTlcrstatus() {
		return tlcrstatus;
	}

	public void setTlcrstatus(String tlcrstatus) {
		this.tlcrstatus = tlcrstatus;
	}

	public Timestamp getTlcrmoddate() {
		return tlcrmoddate;
	}

	public void setTlcrmoddate(Timestamp tlcrmoddate) {
		this.tlcrmoddate = tlcrmoddate;
	}

	public String getTlcrip() {
		return tlcrip;
	}

	public void setTlcrip(String tlcrip) {
		this.tlcrip = tlcrip;
	}
	
	

}
