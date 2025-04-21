package com.erp.test.model;

import java.io.Serializable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table(name = "FACTJOURNALHEADER")
public class FACHTJournalHeader implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
    private FACHTJournalHeaderId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TJOHFYRID", insertable = false, updatable = false)
    private FACMFinancialYear facmfinancialyears;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TJOHUSERNAME", insertable = false, updatable = false)
    private COMMAuthentication commauthentication;

    // Getters and Setters
    public FACHTJournalHeaderId getId() {
        return id;
    }

    public void setId(FACHTJournalHeaderId id) {
        this.id = id;
    }

    public FACMFinancialYear getFacmfinancialyears() {
        return facmfinancialyears;
    }

    public void setFacmfinancialyears(FACMFinancialYear facmfinancialyears) {
        this.facmfinancialyears = facmfinancialyears;
    }

    public COMMAuthentication getCommauthentication() {
        return commauthentication;
    }

    public void setCommauthentication(COMMAuthentication commauthentication) {
        this.commauthentication = commauthentication;
    }
}

