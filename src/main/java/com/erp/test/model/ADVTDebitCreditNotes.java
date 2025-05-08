package com.erp.test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "ADVTDEBITCREDITNOTES")
public class ADVTDebitCreditNotes {
	
	@EmbeddedId
    private ADVTDebitCreditNotesId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TDCEBRNID", insertable = false, updatable = false)
    private ComBranch commbranch;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TDCEUSERNAME", insertable = false, updatable = false)
    private COMMAuthentication commauthentication;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TDCEAMAID", insertable = false, updatable = false)
    private ADVMAgencyMaster advmagencymaster;

	public ADVTDebitCreditNotesId getId() {
		return id;
	}

	public void setId(ADVTDebitCreditNotesId id) {
		this.id = id;
	}

	public ComBranch getCommbranch() {
		return commbranch;
	}

	public void setCommbranch(ComBranch commbranch) {
		this.commbranch = commbranch;
	}

	public COMMAuthentication getCommauthentication() {
		return commauthentication;
	}

	public void setCommauthentication(COMMAuthentication commauthentication) {
		this.commauthentication = commauthentication;
	}

	public ADVMAgencyMaster getAdvmagencymaster() {
		return advmagencymaster;
	}

	public void setAdvmagencymaster(ADVMAgencyMaster advmagencymaster) {
		this.advmagencymaster = advmagencymaster;
	}

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "TDCECGMID", insertable = false, updatable = false)
//    private ADVCategoryGroupMaster advmcategorygroupmaster;
    
    

}
