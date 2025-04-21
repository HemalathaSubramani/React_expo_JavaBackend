package com.erp.test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name="CIRMAGENT")
public class CIRMagent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "region")
    private String region;

    @Column(name = "agentid")
    private String agentId;

    @Column(name = "agentname")
    private String agentName;

    @Column(name = "crdate")
    @Temporal(TemporalType.DATE)
    private Date crDate;

    @Column(name = "crby")
    private String crBy;

    @Column(name = "editdate")
    @Temporal(TemporalType.DATE)
    private Date editDate;

    @Column(name = "editby")
    private String editBy;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public Date getCrDate() {
        return crDate;
    }

    public void setCrDate(Date crDate) {
        this.crDate = crDate;
    }

    public String getCrBy() {
        return crBy;
    }

    public void setCrBy(String crBy) {
        this.crBy = crBy;
    }

    public Date getEditDate() {
        return editDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public String getEditBy() {
        return editBy;
    }

    public void setEditBy(String editBy) {
        this.editBy = editBy;
    }

}
