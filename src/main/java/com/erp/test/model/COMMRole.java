package com.erp.test.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "COMMROLE")
public class COMMRole {

    @Id
    @Column(name = "MROLID")
    private String mrolid; // Primary key of the entity

    @Column(name = "MROLNAME")
    private String mrolname; // Name of the role

    @Column(name = "MROLMODULES")
    private String mrolmodules; // Modules associated with the role

    // Getter and Setter methods for mrolid, mrolname, and mrolmodules

    public String getMrolid() {
        return mrolid;
    }

    public void setMrolid(String mrolid) {
        this.mrolid = mrolid;
    }

    public String getMrolname() {
        return mrolname;
    }

    public void setMrolname(String mrolname) {
        this.mrolname = mrolname;
    }

    public String getMrolmodules() {
        return mrolmodules;
    }

    public void setMrolmodules(String mrolmodules) {
        this.mrolmodules = mrolmodules;
    }


}
