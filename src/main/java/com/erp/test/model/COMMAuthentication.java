package com.erp.test.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

import java.sql.Timestamp;

import jakarta.persistence.*;

@Entity
@Table(name = "COMMAUTHENTICATION")
public class COMMAuthentication {

    @Id
    @Column(name = "MAUTUSERNAME")
    private String mautUsername;

    @ManyToOne
    @JoinColumn(name = "MAUTDPOID") // Proper @JoinColumn for the foreign key relationship
    private ComDepot commDepot;

    @ManyToOne
    @JoinColumn(name = "MAUTROLEID") // Correct use of @JoinColumn
    private COMMRole commRoleByMautRoleId;

    @ManyToOne
    @JoinColumn(name = "MAUTAPPROVALROLID") // Correct @JoinColumn for another relationship
    private COMMRole commRoleByMautApprovalRolId;

    @ManyToOne
    @JoinColumn(name = "MAUTBRNID") // Another @JoinColumn for the relationship
    private ComBranch commBranch;

    @Column(name = "MAUTPASSWORD")
    private String mautPassword;

    @Column(name = "MAUTEMPID")
    private String mautEmpId;

    @Column(name = "MAUTSTATUS")
    private String mautStatus;

    @Column(name = "MAUTIOCODE")
    private String mautIoCode;

    @Column(name = "MAUTMODUSERNAME")
    private String mautModUsername;

    @Column(name = "MAUTMODDATE")
    private Timestamp mautModDate;

    @Column(name = "MAUTCREATEDDATE")
    private Timestamp mautCreatedDate;

    @Column(name = "MAUTUSERTYPE")
    private String mautUserType;

    @Column(name = "MAUTAGPID")
    private String mautAgpId;

    
    @Override
	public String toString() {
		return "COMMAuthentication [mautUsername=" + mautUsername + ", commDepot=" + commDepot
				+ ", commRoleByMautRoleId=" + commRoleByMautRoleId + ", commRoleByMautApprovalRolId="
				+ commRoleByMautApprovalRolId + ", commBranch=" + commBranch + ", mautPassword=" + mautPassword
				+ ", mautEmpId=" + mautEmpId + ", mautStatus=" + mautStatus + ", mautIoCode=" + mautIoCode
				+ ", mautModUsername=" + mautModUsername + ", mautModDate=" + mautModDate + ", mautCreatedDate="
				+ mautCreatedDate + ", mautUserType=" + mautUserType + ", mautAgpId=" + mautAgpId + "]";
	}

	// Getters and Setters
    public String getMautUsername() {
        return mautUsername;
    }

    public void setMautUsername(String mautUsername) {
        this.mautUsername = mautUsername;
    }

    public ComDepot getCommDepot() {
        return commDepot;
    }

    public void setCommDepot(ComDepot commDepot) {
        this.commDepot = commDepot;
    }

    public COMMRole getCommRoleByMautRoleId() {
        return commRoleByMautRoleId;
    }

    public void setCommRoleByMautRoleId(COMMRole commRoleByMautRoleId) {
        this.commRoleByMautRoleId = commRoleByMautRoleId;
    }

    public COMMRole getCommRoleByMautApprovalRolId() {
        return commRoleByMautApprovalRolId;
    }

    public void setCommRoleByMautApprovalRolId(COMMRole commRoleByMautApprovalRolId) {
        this.commRoleByMautApprovalRolId = commRoleByMautApprovalRolId;
    }

    public ComBranch getCommBranch() {
        return commBranch;
    }

    public void setCommBranch(ComBranch commBranch) {
        this.commBranch = commBranch;
    }

    public String getMautPassword() {
        return mautPassword;
    }

    public void setMautPassword(String mautPassword) {
        this.mautPassword = mautPassword;
    }

    public String getMautEmpId() {
        return mautEmpId;
    }

    public void setMautEmpId(String mautEmpId) {
        this.mautEmpId = mautEmpId;
    }

    public String getMautStatus() {
        return mautStatus;
    }

    public void setMautStatus(String mautStatus) {
        this.mautStatus = mautStatus;
    }

    public String getMautIoCode() {
        return mautIoCode;
    }

    public void setMautIoCode(String mautIoCode) {
        this.mautIoCode = mautIoCode;
    }

    public String getMautModUsername() {
        return mautModUsername;
    }

    public void setMautModUsername(String mautModUsername) {
        this.mautModUsername = mautModUsername;
    }

    public Timestamp getMautModDate() {
        return mautModDate;
    }

    public void setMautModDate(Timestamp mautModDate) {
        this.mautModDate = mautModDate;
    }

    public Timestamp getMautCreatedDate() {
        return mautCreatedDate;
    }

    public void setMautCreatedDate(Timestamp mautCreatedDate) {
        this.mautCreatedDate = mautCreatedDate;
    }

    public String getMautUserType() {
        return mautUserType;
    }

    public void setMautUserType(String mautUserType) {
        this.mautUserType = mautUserType;
    }

    public String getMautAgpId() {
        return mautAgpId;
    }

    public void setMautAgpId(String mautAgpId) {
        this.mautAgpId = mautAgpId;
    }
}
