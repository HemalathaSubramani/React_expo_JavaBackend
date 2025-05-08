package com.erp.test.model;

import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name="CIRTPRINTORDER")
public class CIRTPrintOrder {
	
	    @Id
	    @Column(name = "TPORID")
	    private String tporid;

	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "TPORUSERNAME")
	    private COMMAuthentication commauthentication;

	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "TPORBRNID")
	    private ComBranch commbranch;

	    @Column(name = "TPORDATE")
	    @Temporal(TemporalType.DATE)
	    private Date tpordate;

	    @Column(name = "TPORCOPIESTOTAL")
	    private Long tporcopiestotal;

	    @Column(name = "TPORMALTOTAL")
	    private Long tpormaltotal;

	    @Column(name = "TPORPOSTERTOTAL")
	    private Long tporpostertotal;

	    @Column(name = "TPORSTATUS")
	    private String tporstatus;

	    @Column(name = "TPORPOSTERPAGES")
	    private Long tporposterpages;

	    @Column(name = "TPORPAGES")
	    private Long tporpages;

	    @Column(name = "TPORMODDATE")
	    private Timestamp tpormoddate;

	    @Column(name = "TPORIP")
	    private String tporip;

	    @Column(name = "TPORVOLUMENO")
	    private Long tporvolumeno;

	    @Column(name = "TPORISSUENO")
	    private Long tporissueno;

	    // Getters and setters for all the properties
	    public String getTporid() {
	        return tporid;
	    }

	    public void setTporid(String tporid) {
	        this.tporid = tporid;
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

	    public Date getTpordate() {
	        return tpordate;
	    }

	    public void setTpordate(Date tpordate) {
	        this.tpordate = tpordate;
	    }

	    public Long getTpordatecopiestotal() {
	        return tporcopiestotal;
	    }

	    public void setTpordatecopiestotal(Long tpordatecopiestotal) {
	        this.tporcopiestotal = tpordatecopiestotal;
	    }

	    public Long getTpormaltotal() {
	        return tpormaltotal;
	    }

	    public void setTpormaltotal(Long tpormaltotal) {
	        this.tpormaltotal = tpormaltotal;
	    }

	    public Long getTporpostertotal() {
	        return tporpostertotal;
	    }

	    public void setTporpostertotal(Long tporpostertotal) {
	        this.tporpostertotal = tporpostertotal;
	    }

	    public String getTporstatus() {
	        return tporstatus;
	    }

	    public void setTporstatus(String tporstatus) {
	        this.tporstatus = tporstatus;
	    }

	    public Long getTporposterpages() {
	        return tporposterpages;
	    }

	    public void setTporposterpages(Long tporposterpages) {
	        this.tporposterpages = tporposterpages;
	    }

	    public Long getTporpages() {
	        return tporpages;
	    }

	    public void setTporpages(Long tporpages) {
	        this.tporpages = tporpages;
	    }

	    public Timestamp getTpormoddate() {
	        return tpormoddate;
	    }

	    public void setTpormoddate(Timestamp tpormoddate) {
	        this.tpormoddate = tpormoddate;
	    }

	    public String getTporip() {
	        return tporip;
	    }

	    public void setTporip(String tporip) {
	        this.tporip = tporip;
	    }

	    public Long getTporvolumeno() {
	        return tporvolumeno;
	    }

	    public void setTporvolumeno(Long tporvolumeno) {
	        this.tporvolumeno = tporvolumeno;
	    }

	    public Long getTporissueno() {
	        return tporissueno;
	    }

	    public void setTporissueno(Long tporissueno) {
	        this.tporissueno = tporissueno;
	    }
	
}
