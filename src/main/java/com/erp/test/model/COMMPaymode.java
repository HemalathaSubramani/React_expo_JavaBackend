package com.erp.test.model;

import java.util.Set;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="COMMPAYMODE")
public class COMMPaymode {
	
	
		@Id
	    @Column(name = "MPAMPAYMODE", nullable = false)
	    private String mpampaymode;  // Primary Key

	    @Column(name = "MPAMORDER", nullable = false)
	    private Long mpamorder;

	    @Column(name = "MPAMMODULE")
	    private String mpammodule;

	    @Column(name = "MPAMACCOUNTTYPE")
	    private String mpamaccounttype;

	    @Column(name = "MPAMDETAILS")
	    private String mpamdetails;

	    // One-to-Many relationship with CIRTReceipt
	    @OneToMany(mappedBy = "commPaymode", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	    private Set<CIRTReceipt> cirtreceipts;

	    // Constructors
	    public COMMPaymode() {}

	    public COMMPaymode(String mpampaymode, Long mpamorder, String mpammodule, String mpamaccounttype, String mpamdetails) {
	        this.mpampaymode = mpampaymode;
	        this.mpamorder = mpamorder;
	        this.mpammodule = mpammodule;
	        this.mpamaccounttype = mpamaccounttype;
	        this.mpamdetails = mpamdetails;
	    }

	    // Getters and Setters
	    public String getMpampaymode() {
	        return mpampaymode;
	    }

	    public void setMpampaymode(String mpampaymode) {
	        this.mpampaymode = mpampaymode;
	    }

	    public Long getMpamorder() {
	        return mpamorder;
	    }

	    public void setMpamorder(Long mpamorder) {
	        this.mpamorder = mpamorder;
	    }

	    public String getMpammodule() {
	        return mpammodule;
	    }

	    public void setMpammodule(String mpammodule) {
	        this.mpammodule = mpammodule;
	    }

	    public String getMpamaccounttype() {
	        return mpamaccounttype;
	    }

	    public void setMpamaccounttype(String mpamaccounttype) {
	        this.mpamaccounttype = mpamaccounttype;
	    }

	    public String getMpamdetails() {
	        return mpamdetails;
	    }

	    public void setMpamdetails(String mpamdetails) {
	        this.mpamdetails = mpamdetails;
	    }

	    public Set<CIRTReceipt> getCirtreceipts() {
	        return cirtreceipts;
	    }

	    public void setCirtreceipts(Set<CIRTReceipt> cirtreceipts) {
	        this.cirtreceipts = cirtreceipts;
	    }
	

}
