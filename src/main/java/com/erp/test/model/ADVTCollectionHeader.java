package com.erp.test.model;


import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ADVTCOLLECTIONHEADER")
public class ADVTCollectionHeader {

    @Id
    @Column(name = "TCOHRECEIPTNO")
    private String tcohreceiptno;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "TCOHROHIONO")
//    private ADVRoheader advtroheader;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "TCOHAMAID")
//    private ADVMAgencyMaster advmagencymaster;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "TCOHPAMPAYMODE")
//    private COMMpaymode commpaymode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TCOHBRNID")
    private ComBranch commbranch;

    @Temporal(TemporalType.DATE)
    @Column(name = "TCOHPAYDATE")
    private Date tcohpaydate;

    @Column(name = "TCOHNORMALMEMO")
    private String tcohnormalmemo;

    @Column(name = "TCOHAMOUNT", precision = 12)
    private Double tcohamount;

    @Column(name = "TCOHPENDING", precision = 12)
    private Double tcohpending;

    @Column(name = "TCOHDDNO")
    private String tcohddno;

    @Column(name = "TCOHCLMID")
    private String tcohclmid;

    @Column(name = "TCOHCLIENTNAME")
    private String tcohclientname;

    @Column(name = "TCOHVALID")
    private String tcohvalid;

    @Column(name = "TCOHLEDGER")
    private String tcohledger;

    @Column(name = "TCOHMAINRECEIPTNO")
    private String tcohmainreceiptno;

    @Column(name = "TCOHOKAYED")
    private String tcohokayed;

    @Column(name = "TCOHADJUSTED")
    private String tcohadjusted;

    @Column(name = "TCOHBRNCODE")
    private String tcohbrncode;

    @Column(name = "TCOHUSERNAME")
    private String tcohusername;

    @Column(name = "TCOHSTATUS")
    private String tcohstatus;

    @Temporal(TemporalType.DATE)
    @Column(name = "TCOHDDDATE")
    private Date tcohdddate;

    @Temporal(TemporalType.DATE)
    @Column(name = "TCOHRECEIPTDATE")
    private Date tcohreceiptdate;

    @Column(name = "TCOHCANCELREASON")
    private String tcohcancelreason;

    @Temporal(TemporalType.DATE)
    @Column(name = "TCOHMEMODATE")
    private Date tcohmemodate;

    @Temporal(TemporalType.DATE)
    @Column(name = "TCOHMODDATE")
    private Date tcohmoddate;

    @Column(name = "TCOHIP")
    private String tcohip;

    @Column(name = "TCOHBEFOREGSTAMT", precision = 12)
    private Double tcohbeforegstamt;

    @Column(name = "TCOHIGSTAMT", precision = 10)
    private Double tcohigstamt;

    @Column(name = "TCOHIGSTPER", precision = 7)
    private Double tcohigstper;

    @Column(name = "TCOHSGSTAMT", precision = 10)
    private Double tcohsgstamt;

    @Column(name = "TCOHSGSTPER", precision = 7)
    private Double tcohsgstper;

    @Column(name = "TCOHCGSTAMT", precision = 10)
    private Double tcohcgstamt;

    @Column(name = "TCOHCGSTPER", precision = 7)
    private Double tcohcgstper;

    @Column(name = "TCOHTYPE")
    private String tcohtype;

    @Column(name = "TCOHLINKREFNO")
    private String tcohlinkrefno;

	public String getTcohreceiptno() {
		return tcohreceiptno;
	}

	public void setTcohreceiptno(String tcohreceiptno) {
		this.tcohreceiptno = tcohreceiptno;
	}

	public ComBranch getCommbranch() {
		return commbranch;
	}

	public void setCommbranch(ComBranch commbranch) {
		this.commbranch = commbranch;
	}

	public Date getTcohpaydate() {
		return tcohpaydate;
	}

	public void setTcohpaydate(Date tcohpaydate) {
		this.tcohpaydate = tcohpaydate;
	}

	public String getTcohnormalmemo() {
		return tcohnormalmemo;
	}

	public void setTcohnormalmemo(String tcohnormalmemo) {
		this.tcohnormalmemo = tcohnormalmemo;
	}

	public Double getTcohamount() {
		return tcohamount;
	}

	public void setTcohamount(Double tcohamount) {
		this.tcohamount = tcohamount;
	}

	public Double getTcohpending() {
		return tcohpending;
	}

	public void setTcohpending(Double tcohpending) {
		this.tcohpending = tcohpending;
	}

	public String getTcohddno() {
		return tcohddno;
	}

	public void setTcohddno(String tcohddno) {
		this.tcohddno = tcohddno;
	}

	public String getTcohclmid() {
		return tcohclmid;
	}

	public void setTcohclmid(String tcohclmid) {
		this.tcohclmid = tcohclmid;
	}

	public String getTcohclientname() {
		return tcohclientname;
	}

	public void setTcohclientname(String tcohclientname) {
		this.tcohclientname = tcohclientname;
	}

	public String getTcohvalid() {
		return tcohvalid;
	}

	public void setTcohvalid(String tcohvalid) {
		this.tcohvalid = tcohvalid;
	}

	public String getTcohledger() {
		return tcohledger;
	}

	public void setTcohledger(String tcohledger) {
		this.tcohledger = tcohledger;
	}

	public String getTcohmainreceiptno() {
		return tcohmainreceiptno;
	}

	public void setTcohmainreceiptno(String tcohmainreceiptno) {
		this.tcohmainreceiptno = tcohmainreceiptno;
	}

	public String getTcohokayed() {
		return tcohokayed;
	}

	public void setTcohokayed(String tcohokayed) {
		this.tcohokayed = tcohokayed;
	}

	public String getTcohadjusted() {
		return tcohadjusted;
	}

	public void setTcohadjusted(String tcohadjusted) {
		this.tcohadjusted = tcohadjusted;
	}

	public String getTcohbrncode() {
		return tcohbrncode;
	}

	public void setTcohbrncode(String tcohbrncode) {
		this.tcohbrncode = tcohbrncode;
	}

	public String getTcohusername() {
		return tcohusername;
	}

	public void setTcohusername(String tcohusername) {
		this.tcohusername = tcohusername;
	}

	public String getTcohstatus() {
		return tcohstatus;
	}

	public void setTcohstatus(String tcohstatus) {
		this.tcohstatus = tcohstatus;
	}

	public Date getTcohdddate() {
		return tcohdddate;
	}

	public void setTcohdddate(Date tcohdddate) {
		this.tcohdddate = tcohdddate;
	}

	public Date getTcohreceiptdate() {
		return tcohreceiptdate;
	}

	public void setTcohreceiptdate(Date tcohreceiptdate) {
		this.tcohreceiptdate = tcohreceiptdate;
	}

	public String getTcohcancelreason() {
		return tcohcancelreason;
	}

	public void setTcohcancelreason(String tcohcancelreason) {
		this.tcohcancelreason = tcohcancelreason;
	}

	public Date getTcohmemodate() {
		return tcohmemodate;
	}

	public void setTcohmemodate(Date tcohmemodate) {
		this.tcohmemodate = tcohmemodate;
	}

	public Date getTcohmoddate() {
		return tcohmoddate;
	}

	public void setTcohmoddate(Date tcohmoddate) {
		this.tcohmoddate = tcohmoddate;
	}

	public String getTcohip() {
		return tcohip;
	}

	public void setTcohip(String tcohip) {
		this.tcohip = tcohip;
	}

	public Double getTcohbeforegstamt() {
		return tcohbeforegstamt;
	}

	public void setTcohbeforegstamt(Double tcohbeforegstamt) {
		this.tcohbeforegstamt = tcohbeforegstamt;
	}

	public Double getTcohigstamt() {
		return tcohigstamt;
	}

	public void setTcohigstamt(Double tcohigstamt) {
		this.tcohigstamt = tcohigstamt;
	}

	public Double getTcohigstper() {
		return tcohigstper;
	}

	public void setTcohigstper(Double tcohigstper) {
		this.tcohigstper = tcohigstper;
	}

	public Double getTcohsgstamt() {
		return tcohsgstamt;
	}

	public void setTcohsgstamt(Double tcohsgstamt) {
		this.tcohsgstamt = tcohsgstamt;
	}

	public Double getTcohsgstper() {
		return tcohsgstper;
	}

	public void setTcohsgstper(Double tcohsgstper) {
		this.tcohsgstper = tcohsgstper;
	}

	public Double getTcohcgstamt() {
		return tcohcgstamt;
	}

	public void setTcohcgstamt(Double tcohcgstamt) {
		this.tcohcgstamt = tcohcgstamt;
	}

	public Double getTcohcgstper() {
		return tcohcgstper;
	}

	public void setTcohcgstper(Double tcohcgstper) {
		this.tcohcgstper = tcohcgstper;
	}

	public String getTcohtype() {
		return tcohtype;
	}

	public void setTcohtype(String tcohtype) {
		this.tcohtype = tcohtype;
	}

	public String getTcohlinkrefno() {
		return tcohlinkrefno;
	}

	public void setTcohlinkrefno(String tcohlinkrefno) {
		this.tcohlinkrefno = tcohlinkrefno;
	}
    
    

}

