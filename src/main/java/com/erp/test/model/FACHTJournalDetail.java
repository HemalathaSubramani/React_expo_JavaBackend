package com.erp.test.model;

import java.io.Serializable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "FACTJOURNALDETAIL")
public class FACHTJournalDetail implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
    private FACHTJournalDetailId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TJODUSERNAME", insertable = false, updatable = false)
    private COMMAuthentication commauthentication;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TJODLDGID", insertable = false, updatable = false)
    private FACMLedger facmledger;

    // Getters and Setters for the relationships and embedded ID

    public FACHTJournalDetailId getId() {
        return id;
    }

    public void setId(FACHTJournalDetailId id) {
        this.id = id;
    }

    public COMMAuthentication getCommauthentication() {
        return commauthentication;
    }

    public void setCommauthentication(COMMAuthentication commauthentication) {
        this.commauthentication = commauthentication;
    }

    public FACMLedger getFacmledger() {
        return facmledger;
    }

    public void setFacmledger(FACMLedger facmledger) {
        this.facmledger = facmledger;
    }
}
