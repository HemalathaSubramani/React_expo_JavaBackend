package com.erp.test.model;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.*;
import jakarta.persistence.Embeddable;

@Embeddable
public class FACHVLedgerId implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "MLDGID")
    private String mldgid;

    @Column(name = "MLDGNAME")
    private String mldgname;

    @Column(name = "NUM", length = 20)
    private String num;

    @Column(name = "VDATE")
    @Temporal(TemporalType.DATE)
    private Date vdate;

    @Column(name = "DB", precision = 12)
    private Double db;

    @Column(name = "CR", precision = 12)
    private Double cr;

    @Column(name = "YR")
    private String yr;

    @Column(name = "BRN")
    private String brn;

    @Column(name = "REPLICA")
    private String replica;

    @Column(name = "CBG")
    private String cbg;

    @Column(name = "CHEQUENO")
    private String chequeno;

    @Column(name = "REFNO", precision = 22)
    private Long refno;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "MODDATE")
    private java.sql.Timestamp moddate;

    @Column(name = "NARRATION")
    private String narration;

    @Column(name = "CBLEDGERID")
    private String cbledgerid;

    @Column(name = "FYRID")
    private String fyrid;

    // Getters and Setters
    public String getMldgid() {
        return mldgid;
    }

    public void setMldgid(String mldgid) {
        this.mldgid = mldgid;
    }

    public String getMldgname() {
        return mldgname;
    }

    public void setMldgname(String mldgname) {
        this.mldgname = mldgname;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Date getVdate() {
        return vdate;
    }

    public void setVdate(Date vdate) {
        this.vdate = vdate;
    }

    public Double getDb() {
        return db;
    }

    public void setDb(Double db) {
        this.db = db;
    }

    public Double getCr() {
        return cr;
    }

    public void setCr(Double cr) {
        this.cr = cr;
    }

    public String getYr() {
        return yr;
    }

    public void setYr(String yr) {
        this.yr = yr;
    }

    public String getBrn() {
        return brn;
    }

    public void setBrn(String brn) {
        this.brn = brn;
    }

    public String getReplica() {
        return replica;
    }

    public void setReplica(String replica) {
        this.replica = replica;
    }

    public String getCbg() {
        return cbg;
    }

    public void setCbg(String cbg) {
        this.cbg = cbg;
    }

    public String getChequeno() {
        return chequeno;
    }

    public void setChequeno(String chequeno) {
        this.chequeno = chequeno;
    }

    public Long getRefno() {
        return refno;
    }

    public void setRefno(Long refno) {
        this.refno = refno;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public java.sql.Timestamp getModdate() {
        return moddate;
    }

    public void setModdate(java.sql.Timestamp moddate) {
        this.moddate = moddate;
    }

    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }

    public String getCbledgerid() {
        return cbledgerid;
    }

    public void setCbledgerid(String cbledgerid) {
        this.cbledgerid = cbledgerid;
    }

    public String getFyrid() {
        return fyrid;
    }

    public void setFyrid(String fyrid) {
        this.fyrid = fyrid;
    }

}