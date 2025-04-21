package com.erp.test.model;


import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

import jakarta.persistence.*;
import jakarta.persistence.Embeddable;

@Embeddable
public class FACHTJournalDetailId implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "TJODJOHNO")
    private String tjodjohno;

    @Column(name = "TJODDBAMT")
    private Double tjoddbamt;

    @Column(name = "TJODCRAMT")
    private Double tjodcramt;

    @Column(name = "TJODPARTY")
    private String tjodpartyname;

    @Column(name = "TJODNARRATION")
    private String tjodnarration;

    @Column(name = "TJODCBLDGID")
    private String tjodcbldgid;

    @Column(name = "TJODSTATUS")
    private String tjodstatus;

    @Column(name = "TJODMODDATE")
    private Timestamp tjodmoddate;

    @Column(name = "TJODIP")
    private String tjodip;

    @Column(name = "TJODFYRID")
    private String tjodfyrid;

    // Getters and Setters
    public String getTjodjohno() {
        return tjodjohno;
    }

    public void setTjodjohno(String tjodjohno) {
        this.tjodjohno = tjodjohno;
    }

    public Double getTjoddbamt() {
        return tjoddbamt;
    }

    public void setTjoddbamt(Double tjoddbamt) {
        this.tjoddbamt = tjoddbamt;
    }

    public Double getTjodcramt() {
        return tjodcramt;
    }

    public void setTjodcramt(Double tjodcramt) {
        this.tjodcramt = tjodcramt;
    }

    public String getTjodpartyname() {
        return tjodpartyname;
    }

    public void setTjodpartyname(String tjodpartyname) {
        this.tjodpartyname = tjodpartyname;
    }

    public String getTjodnarration() {
        return tjodnarration;
    }

    public void setTjodnarration(String tjodnarration) {
        this.tjodnarration = tjodnarration;
    }

    public String getTjodcbldgid() {
        return tjodcbldgid;
    }

    public void setTjodcbldgid(String tjodcbldgid) {
        this.tjodcbldgid = tjodcbldgid;
    }

    public String getTjodstatus() {
        return tjodstatus;
    }

    public void setTjodstatus(String tjodstatus) {
        this.tjodstatus = tjodstatus;
    }

    public Timestamp getTjodmoddate() {
        return tjodmoddate;
    }

    public void setTjodmoddate(Timestamp tjodmoddate) {
        this.tjodmoddate = tjodmoddate;
    }

    public String getTjodip() {
        return tjodip;
    }

    public void setTjodip(String tjodip) {
        this.tjodip = tjodip;
    }

    public String getTjodfyrid() {
        return tjodfyrid;
    }

    public void setTjodfyrid(String tjodfyrid) {
        this.tjodfyrid = tjodfyrid;
    }

    // Override equals() and hashCode() for composite key
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FACHTJournalDetailId that = (FACHTJournalDetailId) o;
        return tjodjohno.equals(that.tjodjohno) &&
               tjoddbamt.equals(that.tjoddbamt) &&
               tjodcramt.equals(that.tjodcramt) &&
               tjodpartyname.equals(that.tjodpartyname) &&
               tjodnarration.equals(that.tjodnarration) &&
               tjodcbldgid.equals(that.tjodcbldgid) &&
               tjodstatus.equals(that.tjodstatus) &&
               tjodmoddate.equals(that.tjodmoddate) &&
               tjodip.equals(that.tjodip) &&
               tjodfyrid.equals(that.tjodfyrid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tjodjohno, tjoddbamt, tjodcramt, tjodpartyname, tjodnarration, tjodcbldgid, tjodstatus, tjodmoddate, tjodip, tjodfyrid);
    }
}
