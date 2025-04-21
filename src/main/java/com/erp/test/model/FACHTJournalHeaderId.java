package com.erp.test.model;


import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class FACHTJournalHeaderId implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "TJOHNO")
    private String tjohno;

    @Column(name = "TJOHDATE")
    private Date tjohdate;

    @Column(name = "TJOHBRNID")
    private String tjohbrnid;

    @Column(name = "TJOHDPOID")
    private String tjohdpoid;

    @Column(name = "TJOHTYPE")
    private String tjohtype;

    @Column(name = "TJOHCHQNO")
    private String tjohchqno;

    @Column(name = "TJOHBANK")
    private String tjohbank;

    @Column(name = "TJOHCHQDATE")
    private Date tjohchqdate;

    @Column(name = "TJOHCHQCLEARDATE")
    private Date tjohchqcleardate;

    @Column(name = "TJOHREFNO")
    private Long tjohrefno;

    @Column(name = "TJOHSTATUS")
    private String tjohstatus;

    @Column(name = "TJOHMODDATE")
    private java.sql.Timestamp tjohmoddate;

    @Column(name = "TJOHIP")
    private String tjohip;

    @Column(name = "TJOHLOCK")
    private String tjohlock;

    // Getters and Setters
    public String getTjohno() {
        return tjohno;
    }

    public void setTjohno(String tjohno) {
        this.tjohno = tjohno;
    }

    public Date getTjohdate() {
        return tjohdate;
    }

    public void setTjohdate(Date tjohdate) {
        this.tjohdate = tjohdate;
    }

    public String getTjohbrnid() {
        return tjohbrnid;
    }

    public void setTjohbrnid(String tjohbrnid) {
        this.tjohbrnid = tjohbrnid;
    }

    public String getTjohdpoid() {
        return tjohdpoid;
    }

    public void setTjohdpoid(String tjohdpoid) {
        this.tjohdpoid = tjohdpoid;
    }

    public String getTjohtype() {
        return tjohtype;
    }

    public void setTjohtype(String tjohtype) {
        this.tjohtype = tjohtype;
    }

    public String getTjohchqno() {
        return tjohchqno;
    }

    public void setTjohchqno(String tjohchqno) {
        this.tjohchqno = tjohchqno;
    }

    public String getTjohbank() {
        return tjohbank;
    }

    public void setTjohbank(String tjohbank) {
        this.tjohbank = tjohbank;
    }

    public Date getTjohchqdate() {
        return tjohchqdate;
    }

    public void setTjohchqdate(Date tjohchqdate) {
        this.tjohchqdate = tjohchqdate;
    }

    public Date getTjohchqcleardate() {
        return tjohchqcleardate;
    }

    public void setTjohchqcleardate(Date tjohchqcleardate) {
        this.tjohchqcleardate = tjohchqcleardate;
    }

    public Long getTjohrefno() {
        return tjohrefno;
    }

    public void setTjohrefno(Long tjohrefno) {
        this.tjohrefno = tjohrefno;
    }

    public String getTjohstatus() {
        return tjohstatus;
    }

    public void setTjohstatus(String tjohstatus) {
        this.tjohstatus = tjohstatus;
    }

    public java.sql.Timestamp getTjohmoddate() {
        return tjohmoddate;
    }

    public void setTjohmoddate(java.sql.Timestamp tjohmoddate) {
        this.tjohmoddate = tjohmoddate;
    }

    public String getTjohip() {
        return tjohip;
    }

    public void setTjohip(String tjohip) {
        this.tjohip = tjohip;
    }

    public String getTjohlock() {
        return tjohlock;
    }

    public void setTjohlock(String tjohlock) {
        this.tjohlock = tjohlock;
    }

    // Override equals() and hashCode() for composite key
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FACHTJournalHeaderId that = (FACHTJournalHeaderId) o;
        return tjohno.equals(that.tjohno) &&
               tjohdate.equals(that.tjohdate) &&
               tjohbrnid.equals(that.tjohbrnid) &&
               tjohdpoid.equals(that.tjohdpoid) &&
               tjohtype.equals(that.tjohtype) &&
               tjohchqno.equals(that.tjohchqno) &&
               tjohbank.equals(that.tjohbank) &&
               tjohchqdate.equals(that.tjohchqdate) &&
               tjohchqcleardate.equals(that.tjohchqcleardate) &&
               tjohrefno.equals(that.tjohrefno) &&
               tjohstatus.equals(that.tjohstatus) &&
               tjohmoddate.equals(that.tjohmoddate) &&
               tjohip.equals(that.tjohip) &&
               tjohlock.equals(that.tjohlock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tjohno, tjohdate, tjohbrnid, tjohdpoid, tjohtype, tjohchqno, tjohbank, tjohchqdate, tjohchqcleardate, tjohrefno, tjohstatus, tjohmoddate, tjohip, tjohlock);
    }
}

