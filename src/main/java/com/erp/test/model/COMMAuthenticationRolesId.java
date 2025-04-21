package com.erp.test.model;


import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.*;

@SuppressWarnings("serial")
@Embeddable
public class COMMAuthenticationRolesId implements Serializable {
    @Column(name = "MAURUSERNAME")
    private String maurusername;

    @Column(name = "MAURROLID")
    private String maurrolid;

    @Column(name = "MAURAPPROVALROLID")
    private String maurapprovalrolid;

    @Column(name = "MAURCREATEDDATE")
    private Date maurcreateddate;

    @Column(name = "MAURSTATUS")
    private String maurstatus;

    // Getters and Setters
    public String getMaurusername() {
        return maurusername;
    }

    public void setMaurusername(String maurusername) {
        this.maurusername = maurusername;
    }

    public String getMaurrolid() {
        return maurrolid;
    }

    public void setMaurrolid(String maurrolid) {
        this.maurrolid = maurrolid;
    }

    public String getMaurapprovalrolid() {
        return maurapprovalrolid;
    }

    public void setMaurapprovalrolid(String maurapprovalrolid) {
        this.maurapprovalrolid = maurapprovalrolid;
    }

    public Date getMaurcreateddate() {
        return maurcreateddate;
    }

    public void setMaurcreateddate(Date maurcreateddate) {
        this.maurcreateddate = maurcreateddate;
    }

    public String getMaurstatus() {
        return maurstatus;
    }

    public void setMaurstatus(String maurstatus) {
        this.maurstatus = maurstatus;
    }

    // Override hashCode and equals for proper comparison of composite keys
    @Override
    public int hashCode() {
        int result = maurusername != null ? maurusername.hashCode() : 0;
        result = 31 * result + (maurrolid != null ? maurrolid.hashCode() : 0);
        result = 31 * result + (maurapprovalrolid != null ? maurapprovalrolid.hashCode() : 0);
        result = 31 * result + (maurcreateddate != null ? maurcreateddate.hashCode() : 0);
        result = 31 * result + (maurstatus != null ? maurstatus.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        COMMAuthenticationRolesId that = (COMMAuthenticationRolesId) obj;

        if (maurusername != null ? !maurusername.equals(that.maurusername) : that.maurusername != null) return false;
        if (maurrolid != null ? !maurrolid.equals(that.maurrolid) : that.maurrolid != null) return false;
        if (maurapprovalrolid != null ? !maurapprovalrolid.equals(that.maurapprovalrolid) : that.maurapprovalrolid != null)
            return false;
        if (maurcreateddate != null ? !maurcreateddate.equals(that.maurcreateddate) : that.maurcreateddate != null)
            return false;
        return maurstatus != null ? maurstatus.equals(that.maurstatus) : that.maurstatus == null;
    }
}

