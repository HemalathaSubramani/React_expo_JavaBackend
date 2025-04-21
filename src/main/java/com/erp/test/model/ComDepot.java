package com.erp.test.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.sql.Timestamp;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "COMMDEPOT")
public class ComDepot {

    @Id
    @Column(name = "MDPOID")
    private String mdpoid; // Primary key of the entity

    @ManyToOne
    @JoinColumn(name = "MDPOBRNID")
    private ComBranch commbranch; // Relationship with ComBranch entity

    @Column(name = "MDPONAME")
    private String mdponame; // Name of the depot

    @Column(name = "MDPOUSERNAME")
    private String mdpousername; // Username associated with the depot

    @Column(name = "MDPOMODDATE")
    private Timestamp mdpomoddate; // Modification date

    @Column(name = "MDPOSTATUS")
    private String mdpostatus; // Status of the depot

    @Column(name = "MDPOREMARKS")
    private String mdporemarks; // Remarks related to the depot

    @Column(name = "MDPOIP")
    private String mdpoip; // IP address associated with the depot

//    @OneToMany(mappedBy = "commdepot", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    private Set<HRMTTransfer> setTransDepot; // Set of related HRMTTransfer entities

    // Getter and Setter methods for all fields

    public String getMdpoid() {
        return mdpoid;
    }

    public void setMdpoid(String mdpoid) {
        this.mdpoid = mdpoid;
    }

    public ComBranch getCommbranch() {
        return commbranch;
    }

    public void setCommbranch(ComBranch commbranch) {
        this.commbranch = commbranch;
    }

    public String getMdponame() {
        return mdponame;
    }

    public void setMdponame(String mdponame) {
        this.mdponame = mdponame;
    }

    public String getMdpousername() {
        return mdpousername;
    }

    public void setMdpousername(String mdpousername) {
        this.mdpousername = mdpousername;
    }

    public Timestamp getMdpomoddate() {
        return mdpomoddate;
    }

    public void setMdpomoddate(Timestamp mdpomoddate) {
        this.mdpomoddate = mdpomoddate;
    }

    public String getMdpostatus() {
        return mdpostatus;
    }

    public void setMdpostatus(String mdpostatus) {
        this.mdpostatus = mdpostatus;
    }

    public String getMdporemarks() {
        return mdporemarks;
    }

    public void setMdporemarks(String mdporemarks) {
        this.mdporemarks = mdporemarks;
    }

    public String getMdpoip() {
        return mdpoip;
    }

    public void setMdpoip(String mdpoip) {
        this.mdpoip = mdpoip;
    }

//    public Set<HRMTTransfer> getSetTransDepot() {
//        return setTransDepot;
//    }
//
//    public void setSetTransDepot(Set<HRMTTransfer> setTransDepot) {
//        this.setTransDepot = setTransDepot;
//    }

}
