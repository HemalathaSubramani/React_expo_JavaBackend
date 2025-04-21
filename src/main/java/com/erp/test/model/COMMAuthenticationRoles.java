package com.erp.test.model;


import jakarta.persistence.*;

@Entity
@Table(name = "COMMAUTHENTICATIONROLES")
public class COMMAuthenticationRoles {

    @EmbeddedId
    private COMMAuthenticationRolesId id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "MAURROLID", referencedColumnName = "MROLID", insertable = false, updatable = false)
    private COMMRole commroleByMaurrolid;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "MAURUSERNAME", referencedColumnName = "MAUTUSERNAME", insertable = false, updatable = false)
    private COMMAuthentication commauthentication;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "MAURAPPROVALROLID", referencedColumnName = "MROLID", insertable = false, updatable = false)
    private COMMRole commroleByMaurapprovalrolid;

//    @Column(name = "MAURCREATEDDATE")
//    private Date maurcreateddate;
//
//    @Column(name = "MAURSTATUS")
//    private String maurstatus;

    // Getters and Setters

    public COMMAuthenticationRolesId getId() {
        return id;
    }

    public void setId(COMMAuthenticationRolesId id) {
        this.id = id;
    }

    public COMMRole getCommroleByMaurrolid() {
        return commroleByMaurrolid;
    }

    public void setCommroleByMaurrolid(COMMRole commroleByMaurrolid) {
        this.commroleByMaurrolid = commroleByMaurrolid;
    }

    public COMMAuthentication getCommauthentication() {
        return commauthentication;
    }

    public void setCommauthentication(COMMAuthentication commauthentication) {
        this.commauthentication = commauthentication;
    }

    public COMMRole getCommroleByMaurapprovalrolid() {
        return commroleByMaurapprovalrolid;
    }

    public void setCommroleByMaurapprovalrolid(COMMRole commroleByMaurapprovalrolid) {
        this.commroleByMaurapprovalrolid = commroleByMaurapprovalrolid;
    }

//    public Date getMaurcreateddate() {
//        return maurcreateddate;
//    }
//
//    public void setMaurcreateddate(Date maurcreateddate) {
//        this.maurcreateddate = maurcreateddate;
//    }
//
//    public String getMaurstatus() {
//        return maurstatus;
//    }
//
//    public void setMaurstatus(String maurstatus) {
//        this.maurstatus = maurstatus;
//    }
}
