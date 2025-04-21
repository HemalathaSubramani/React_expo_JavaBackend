package com.erp.test.model;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "FACMFINANCIALYEARS")
public class FACMFinancialYear {

    @Id
    @Column(name = "MFYRID")
    private String mfyrid;

    @Column(name = "MFYRSDATE")
    private Date mfyrsdate;

    @Column(name = "MFYREDATE")
    private Date mfyredate;

    @Column(name = "MFYRUSERNAME")
    private String mfyrusername;

    @Column(name = "MFYRMODDATE")
    private Timestamp mfyrmoddate;

    @Column(name = "MFYRSTATUS")
    private String mfyrstatus;

    @Column(name = "MFYRREMARKS")
    private String mfyrremarks;

    @Column(name = "MFYRBRNID")
    private String mfyrbrnid;

    // Relationships

    // Constructors, getters, and setters

    public FACMFinancialYear() {}

    public String getMfyrid() {
        return mfyrid;
    }

    public void setMfyrid(String mfyrid) {
        this.mfyrid = mfyrid;
    }

    public Date getMfyrsdate() {
        return mfyrsdate;
    }

    public void setMfyrsdate(Date mfyrsdate) {
        this.mfyrsdate = mfyrsdate;
    }

    public Date getMfyredate() {
        return mfyredate;
    }

    public void setMfyredate(Date mfyredate) {
        this.mfyredate = mfyredate;
    }

    public String getMfyrusername() {
        return mfyrusername;
    }

    public void setMfyrusername(String mfyrusername) {
        this.mfyrusername = mfyrusername;
    }

    public Timestamp getMfyrmoddate() {
        return mfyrmoddate;
    }

    public void setMfyrmoddate(Timestamp mfyrmoddate) {
        this.mfyrmoddate = mfyrmoddate;
    }

    public String getMfyrstatus() {
        return mfyrstatus;
    }

    public void setMfyrstatus(String mfyrstatus) {
        this.mfyrstatus = mfyrstatus;
    }

    public String getMfyrremarks() {
        return mfyrremarks;
    }

    public void setMfyrremarks(String mfyrremarks) {
        this.mfyrremarks = mfyrremarks;
    }

    public String getMfyrbrnid() {
        return mfyrbrnid;
    }

    public void setMfyrbrnid(String mfyrbrnid) {
        this.mfyrbrnid = mfyrbrnid;
    }

}

