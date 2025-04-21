package com.erp.test.model;

import jakarta.persistence.Entity;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name="CIRTRECEIPT")
public class CIRTReceipt {
	
	@Id
    @Column(name = "TRECRECEIPTNO")
    private String trecReceiptNo;

//    @ManyToOne(fetch=FetchType.LAZY)
//    @JoinColumn(name = "TRECBANID")
//    private ComBanks commBanks;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRECPAYMODE")
    private COMMPaymode commPaymode;

    @Temporal(TemporalType.DATE)
    @Column(name = "TRECRECEIPTDATE")
    private Date trecReceiptDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "TRECPAYDATE")
    private Date trecPayDate;

    @Column(name = "TRECBRNCODE")
    private String trecBrnCode;

    @Column(name = "TRECCAGID")
    private String trecCagId;

    @Column(name = "TRECAMOUNT")
    private Double trecAmount;

    @Column(name = "TRECREMARKS")
    private String trecRemarks;

    @Column(name = "TRECLEDGER")
    private String trecLedger;

    @Column(name = "TRECSTATUS")
    private String trecStatus;

    @Column(name = "TRECISLATE")
    private String trecIsLate;

    @Column(name = "TRECCHNO")
    private String trecChNo;

    @Temporal(TemporalType.DATE)
    @Column(name = "TRECCHDATE")
    private Date trecChDate;

    @Column(name = "TRECBRANCH")
    private String trecBranch;

    @Column(name = "TRECCLNID")
    private String trecClnId;

    @Column(name = "TRECUSERNAME")
    private String trecUsername;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TRECMODDATE")
    private Date trecModDate;

    @Column(name = "TRECIP")
    private String trecIp;

    @Column(name = "TRECBANKCOMM")
    private String trecBankComm;

    @Column(name = "TRECPRINTED")
    private String trecPrinted;

    @Column(name = "TRECREGPRINTED")
    private String trecRegPrinted;

    @Column(name = "TRECLINKREFNO")
    private String trecLinkRefNo;

    // Getters and Setters
    public String getTrecReceiptNo() {
        return trecReceiptNo;
    }

    public void setTrecReceiptNo(String trecReceiptNo) {
        this.trecReceiptNo = trecReceiptNo;
    }

    public Date getTrecPayDate() {
        return trecPayDate;
    }

    public void setTrecPayDate(Date trecPayDate) {
        this.trecPayDate = trecPayDate;
    }

    public Double getTrecAmount() {
        return trecAmount;
    }

    public void setTrecAmount(Double trecAmount) {
        this.trecAmount = trecAmount;
    }

    public COMMPaymode getCommPaymode() {
        return commPaymode;
    }

    public void setCommPaymode(COMMPaymode commPaymode) {
        this.commPaymode = commPaymode;
    }


}
