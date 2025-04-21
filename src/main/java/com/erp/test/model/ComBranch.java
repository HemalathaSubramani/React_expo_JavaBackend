package com.erp.test.model;

import jakarta.persistence.Entity;

import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.*;

@Entity
@Table(name = "COMMBRANCH")
public class ComBranch {

    @Id
    @Column(name = "MBRNID")
    private String mbrnid; // Primary key of the entity

    @Column(name = "MBRNNAME")
    private String mbrnname; // Branch name

    @Column(name = "MBRNCODE", unique = true)
    private String mbrncode; // Branch code (unique)

    @Column(name = "MBRNDAVPCODE")
    private String mbrndavpcode; // DAVP code

    @Column(name = "MBRNADDRESS1")
    private String mbrnaddress1; // Address 1

    @Column(name = "MBRNADDRESS2")
    private String mbrnaddress2; // Address 2

    @Column(name = "MBRNPHONENO")
    private String mbrnphoneno; // Phone number

    @Column(name = "MBRNORDERNO")
    private String mbrnorderno; // Order number

    @Column(name = "MBRNUSERNAME")
    private String mbrnusername; // Username associated with the branch

    @Column(name = "MBRNMODDATE")
    private Timestamp mbrnmoddate; // Modification date

    @Column(name = "MBRNSTATUS")
    private String mbrnstatus; // Status of the branch

    @Column(name = "MBRNREMARKS")
    private String mbrnremarks; // Remarks related to the branch

    @Column(name = "MBRNPRINT")
    private String mbrnprint; // Print configuration

    @Column(name = "MBRNPFCODE")
    private String mbrnpfcode; // PF code

    @Column(name = "MBRNESICOMPNAME")
    private String mbrnesicompname; // ESIC company name

    @Column(name = "MBRNESINO")
    private String mbrnesino; // ESIC number

    @Column(name = "MBRNESIBRANCH")
    private String mbrnesibranch; // ESIC branch

    @Column(name = "MBRNLWFACNO")
    private String mbrnlwfacno; // LW facility number

    @Column(name = "MBRNEMAIL")
    private String mbrnemail; // Email

    @Column(name = "MBRNADVEMAIL")
    private String mbrnadvemail; // Additional email

    @Column(name = "MBRNADVPHONENO")
    private String mbrnadvphoneno; // Additional phone number

    @Column(name = "MBRNCIREMAIL")
    private String mbrnciremail; // CIR email

    @Column(name = "MBRNCIRPHONENO")
    private String mbrncirphoneno; // CIR phone number

    @Column(name = "MBRNFACEMAIL")
    private String mbrnfacemail; // Factory email

    @Column(name = "MBRNFACPHONENO")
    private String mbrnfacphoneno; // Factory phone number

    @Column(name = "MBRNHRMEMAIL")
    private String mbrnhrmemail; // HR email

    @Column(name = "MBRNHRMPHONENO")
    private String mbrnhrmphoneno; // HR phone number

    @Column(name = "MBRNMNTEMAIL")
    private String mbrnmntemail; // Maintenance email

    @Column(name = "MBRNMNTPHONENO")
    private String mbrnmntphoneno; // Maintenance phone number

    @Column(name = "MBRNPASEMAIL")
    private String mbrnpasemail; // Pass email

    @Column(name = "MBRNPASPHONENO")
    private String mbrnpasphoneno; // Pass phone number

    @Column(name = "MBRNTRNEMAIL")
    private String mbrntrnemail; // Training email

    @Column(name = "MBRNTRNPHONENO")
    private String mbrntrnphoneno; // Training phone number

    @Column(name = "MBRNSTARTDATE")
    private Date mbrnstartdate; // Start date

//    @ManyToOne(fetch = FetchType.)
//    @JoinColumn(name = "MBRNGSSID")
//    private CommGSTState commgststate; // Relationship with CommGSTState entity

    @Column(name = "MBRNGSTIN")
    private String mbrngstin; // GSTIN

    @Column(name = "MBRNBANK")
    private String mbrnbank; // Bank name

    @Column(name = "MBRNBRANCH")
    private String mbrnbranch; // Branch name for bank

    @Column(name = "MBRNACNO")
    private String mbrnacno; // Account number

    @Column(name = "MBRNIFSC")
    private String mbrnifsc; // IFSC code

    @Column(name = "MBRNLEGALNAME")
    private String mbrnlegalname; // Legal name of the branch

    @Column(name = "MBRNPOSTCODE")
    private String mbrnpostcode; // Postcode

    @Column(name = "MBRNDBINFO")
    private String mbrndbinfo; // Database info

    @Column(name = "MBRNLOCALBRNID")
    private String mbrnlocalbrnid; // Local branch ID

    @Column(name = "MBRNEXTERNALBRNID")
    private String mbrnexternalbrnid; // External branch ID

    // Getter and Setter methods for all fields

    public String getMbrnid() {
        return mbrnid;
    }

    public void setMbrnid(String mbrnid) {
        this.mbrnid = mbrnid;
    }

    public String getMbrnname() {
        return mbrnname;
    }

    public void setMbrnname(String mbrnname) {
        this.mbrnname = mbrnname;
    }

    public String getMbrncode() {
        return mbrncode;
    }

    public void setMbrncode(String mbrncode) {
        this.mbrncode = mbrncode;
    }

    public String getMbrndavpcode() {
        return mbrndavpcode;
    }

    public void setMbrndavpcode(String mbrndavpcode) {
        this.mbrndavpcode = mbrndavpcode;
    }

    public String getMbrnaddress1() {
        return mbrnaddress1;
    }

    public void setMbrnaddress1(String mbrnaddress1) {
        this.mbrnaddress1 = mbrnaddress1;
    }

    public String getMbrnaddress2() {
        return mbrnaddress2;
    }

    public void setMbrnaddress2(String mbrnaddress2) {
        this.mbrnaddress2 = mbrnaddress2;
    }

    public String getMbrnphoneno() {
        return mbrnphoneno;
    }

    public void setMbrnphoneno(String mbrnphoneno) {
        this.mbrnphoneno = mbrnphoneno;
    }

    public String getMbrnorderno() {
        return mbrnorderno;
    }

    public void setMbrnorderno(String mbrnorderno) {
        this.mbrnorderno = mbrnorderno;
    }

    public String getMbrnusername() {
        return mbrnusername;
    }

    public void setMbrnusername(String mbrnusername) {
        this.mbrnusername = mbrnusername;
    }

    public Timestamp getMbrnmoddate() {
        return mbrnmoddate;
    }

    public void setMbrnmoddate(Timestamp mbrnmoddate) {
        this.mbrnmoddate = mbrnmoddate;
    }

    public String getMbrnstatus() {
        return mbrnstatus;
    }

    public void setMbrnstatus(String mbrnstatus) {
        this.mbrnstatus = mbrnstatus;
    }

    public String getMbrnremarks() {
        return mbrnremarks;
    }

    public void setMbrnremarks(String mbrnremarks) {
        this.mbrnremarks = mbrnremarks;
    }

    public String getMbrnprint() {
        return mbrnprint;
    }

    public void setMbrnprint(String mbrnprint) {
        this.mbrnprint = mbrnprint;
    }

    public String getMbrnpfcode() {
        return mbrnpfcode;
    }

    public void setMbrnpfcode(String mbrnpfcode) {
        this.mbrnpfcode = mbrnpfcode;
    }

    public String getMbrnesicompname() {
        return mbrnesicompname;
    }

    public void setMbrnesicompname(String mbrnesicompname) {
        this.mbrnesicompname = mbrnesicompname;
    }

    public String getMbrnesino() {
        return mbrnesino;
    }

    public void setMbrnesino(String mbrnesino) {
        this.mbrnesino = mbrnesino;
    }

    public String getMbrnesibranch() {
        return mbrnesibranch;
    }

    public void setMbrnesibranch(String mbrnesibranch) {
        this.mbrnesibranch = mbrnesibranch;
    }

    public String getMbrnlwfacno() {
        return mbrnlwfacno;
    }

    public void setMbrnlwfacno(String mbrnlwfacno) {
    	this.mbrnlwfacno = mbrnlwfacno;
    	}
    }


