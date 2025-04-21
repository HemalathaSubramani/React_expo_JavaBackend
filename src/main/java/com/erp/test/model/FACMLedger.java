package com.erp.test.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "FACMLEDGER")
public class FACMLedger {

    @Id
    @Column(name = "MLDGID")
    private String mldgid;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "MLDGAGRID")
//    private FACMGroup facmgroup;

    @Column(name = "MLDGBRNID")
    private String mldgbrnid;

    @Column(name = "MLDGDPOID")
    private String mldgdpoid;

    @Column(name = "MLDGNAME")
    private String mldgname;

    @Column(name = "MLDGREPLICA")
    private String mldgreplica;

    @Column(name = "MLDGADDRESS1")
    private String mldgaddress1;

    @Column(name = "MLDGADDRESS2")
    private String mldgaddress2;

    @Column(name = "MLDGADDRESS3")
    private String mldgaddress3;

    @Column(name = "MLDGPOSTCODE")
    private String mldgpostcode;

    @Column(name = "MLDGCITID")
    private String mldgcitid;

    @Column(name = "MLDGDSTID")
    private String mldgdstid;

    @Column(name = "MLDGSTAID")
    private String mldgstaid;

    @Column(name = "MLDGCOUID")
    private String mldgcouid;

    @Column(name = "MLDGTYPE")
    private String mldgtype;

    @Column(name = "MLDGPL")
    private String mldgpl;

    @Column(name = "MLDGCPCID")
    private String mldgcpcid;

    @Column(name = "MLDGITNO")
    private String mldgitno;

    @Column(name = "MLDGSTNO")
    private String mldgstno;

    @Column(name = "MLDGAPPLICABLE")
    private String mldgapplicable;

    @Column(name = "MLDGTDSCEILING", precision = 12)
    private Double mldgtdsceiling;

    @Column(name = "MLDGTDSPERCENTAGE", precision = 5)
    private Double mldgtdspercentage;

    @Column(name = "MLDGCBG")
    private String mldgcbg;

    @Column(name = "MLDGBRNDETAILS")
    private String mldgbrndetails;

    @Column(name = "MLDGUSERNAME")
    private String mldgusername;

    @Column(name = "MLDGMODDATE")
    private Timestamp mldgmoddate;

    @Column(name = "MLDGSTATUS")
    private String mldgstatus;

    @Column(name = "MLDGREMARKS")
    private String mldgremarks;

    @Column(name = "MLDGHOMEBRNCODE")
    private String mldghomebrncode;

    @Column(name = "MLDGGSTLEDGERLINK")
    private String mldggstledgerlink;

    @Column(name = "MLDGGSTTYPE")
    private String mldggsttype;

    @Column(name = "MLDGGSTHSNCODE")
    private String mldggsthsncode;

    @Column(name = "MLDGGSSID")
    private String mldggssid;

    @Column(name = "MLDGTDSLEDGERLINK")
    private String mldgtdsledgerlink;

    @Column(name = "MLDGCONTACTPERSON")
    private String mldgcontactperson;

    @Column(name = "MLDGEMAIL")
    private String mldgemail;

    @Column(name = "MLDGPHONE")
    private String mldgphone;

    @Column(name = "MLDGMODULES")
    private String mldgmodules;

    // Getters and Setters
    public String getMldgid() {
        return mldgid;
    }

    public void setMldgid(String mldgid) {
        this.mldgid = mldgid;
    }

//    public FACMGroup getFacmgroup() {
//        return facmgroup;
//    }
//
//    public void setFacmgroup(FACMGroup facmgroup) {
//        this.facmgroup = facmgroup;
//    }

    public String getMldgbrnid() {
        return mldgbrnid;
    }

    public void setMldgbrnid(String mldgbrnid) {
        this.mldgbrnid = mldgbrnid;
    }

    public String getMldgdpoid() {
        return mldgdpoid;
    }

    public void setMldgdpoid(String mldgdpoid) {
        this.mldgdpoid = mldgdpoid;
    }

    public String getMldgname() {
        return mldgname;
    }

    public void setMldgname(String mldgname) {
        this.mldgname = mldgname;
    }

    public String getMldgreplica() {
        return mldgreplica;
    }

    public void setMldgreplica(String mldgreplica) {
        this.mldgreplica = mldgreplica;
    }

    public String getMldgaddress1() {
        return mldgaddress1;
    }

    public void setMldgaddress1(String mldgaddress1) {
        this.mldgaddress1 = mldgaddress1;
    }

    public String getMldgaddress2() {
        return mldgaddress2;
    }

    public void setMldgaddress2(String mldgaddress2) {
        this.mldgaddress2 = mldgaddress2;
    }

    public String getMldgaddress3() {
        return mldgaddress3;
    }

    public void setMldgaddress3(String mldgaddress3) {
        this.mldgaddress3 = mldgaddress3;
    }

    public String getMldgpostcode() {
        return mldgpostcode;
    }

    public void setMldgpostcode(String mldgpostcode) {
        this.mldgpostcode = mldgpostcode;
    }

    public String getMldgcitid() {
        return mldgcitid;
    }

    public void setMldgcitid(String mldgcitid) {
        this.mldgcitid = mldgcitid;
    }

    public String getMldgdstid() {
        return mldgdstid;
    }

    public void setMldgdstid(String mldgdstid) {
        this.mldgdstid = mldgdstid;
    }

    public String getMldgstaid() {
        return mldgstaid;
    }

    public void setMldgstaid(String mldgstaid) {
        this.mldgstaid = mldgstaid;
    }

    public String getMldgcouid() {
        return mldgcouid;
    }

    public void setMldgcouid(String mldgcouid) {
        this.mldgcouid = mldgcouid;
    }

    public String getMldgtype() {
        return mldgtype;
    }

    public void setMldgtype(String mldgtype) {
        this.mldgtype = mldgtype;
    }

    public String getMldgpl() {
        return mldgpl;
    }

    public void setMldgpl(String mldgpl) {
        this.mldgpl = mldgpl;
    }

    public String getMldgcpcid() {
        return mldgcpcid;
    }

    public void setMldgcpcid(String mldgcpcid) {
        this.mldgcpcid = mldgcpcid;
    }

    public String getMldgitno() {
        return mldgitno;
    }

    public void setMldgitno(String mldgitno) {
        this.mldgitno = mldgitno;
    }

    public String getMldgstno() {
        return mldgstno;
    }

    public void setMldgstno(String mldgstno) {
        this.mldgstno = mldgstno;
    }

    public String getMldgapplicable() {
        return mldgapplicable;
    }

    public void setMldgapplicable(String mldgapplicable) {
        this.mldgapplicable = mldgapplicable;
    }

    public Double getMldgtdsceiling() {
        return mldgtdsceiling;
    }

    public void setMldgtdsceiling(Double mldgtdsceiling) {
        this.mldgtdsceiling = mldgtdsceiling;
    }

    public Double getMldgtdspercentage() {
        return mldgtdspercentage;
    }

    public void setMldgtdspercentage(Double mldgtdspercentage) {
        this.mldgtdspercentage = mldgtdspercentage;
    }

    public String getMldgcbg() {
        return mldgcbg;
    }

    public void setMldgcbg(String mldgcbg) {
        this.mldgcbg = mldgcbg;
    }

    public String getMldgbrndetails() {
        return mldgbrndetails;
    }

    public void setMldgbrndetails(String mldgbrndetails) {
        this.mldgbrndetails = mldgbrndetails;
    }

    public String getMldgusername() {
        return mldgusername;
    }

    public void setMldgusername(String mldgusername) {
        this.mldgusername = mldgusername;
    }

    public Timestamp getMldgmoddate() {
        return mldgmoddate;
    }

    public void setMldgmoddate(Timestamp mldgmoddate) {
        this.mldgmoddate = mldgmoddate;
    }

    public String getMldgstatus() {
        return mldgstatus;
    }

    public void setMldgstatus(String mldgstatus) {
        this.mldgstatus = mldgstatus;
    }

    public String getMldgremarks() {
        return mldgremarks;
    }

    public void setMldgremarks(String mldgremarks) {
        this.mldgremarks = mldgremarks;
    }

    public String getMldghomebrncode() {
        return mldghomebrncode;
    }

    public void setMldghomebrncode(String mldghomebrncode) {
        this.mldghomebrncode = mldghomebrncode;
    }

    public String getMldggstledgerlink() {
        return mldggstledgerlink;
    }

    public void setMldggstledgerlink(String mldggstledgerlink) {
        this.mldggstledgerlink = mldggstledgerlink;
    }

    public String getMldggsttype() {
        return mldggsttype;
    }

    public void setMldggsttype(String mldggsttype) {
        this.mldggsttype = mldggsttype;
    }

    public String getMldggsthsncode() {
        return mldggsthsncode;
    }

    public void setMldggsthsncode(String mldggsthsncode) {
        this.mldggsthsncode = mldggsthsncode;
    }

    public String getMldggssid() {
        return mldggssid;
    }

    public void setMldggssid(String mldggssid) {
        this.mldggssid = mldggssid;
    }

    public String getMldgtdsledgerlink() {
        return mldgtdsledgerlink;
    }

    public void setMldgtdsledgerlink(String mldgtdsledgerlink) {
        this.mldgtdsledgerlink = mldgtdsledgerlink;
    }

    public String getMldgcontactperson() {
        return mldgcontactperson;
    }

    public void setMldgcontactperson(String mldgcontactperson) {
        this.mldgcontactperson = mldgcontactperson;
    }

    public String getMldgemail() {
        return mldgemail;
    }

    public void setMldgemail(String mldgemail) {
        this.mldgemail = mldgemail;
    }

    public String getMldgphone() {
        return mldgphone;
    }

    public void setMldgphone(String mldgphone) {
        this.mldgphone = mldgphone;
    }

    public String getMldgmodules() {
        return mldgmodules;
    }

    public void setMldgmodules(String mldgmodules) {
        this.mldgmodules = mldgmodules;
    }
}
