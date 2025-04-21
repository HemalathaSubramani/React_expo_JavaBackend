package com.erp.test.model;

import java.io.Serializable;

import jakarta.persistence.*;
import jakarta.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "FACTOPENINGBALANCE")
public class FACTOpeningBalance implements Serializable {

    @EmbeddedId
    private FACTLedgerOpeningBalnceId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TOBLLDGID", insertable = false, updatable = false)
    private FACMLedger facmledger;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TOBLFYRID", insertable = false, updatable = false)
    private FACMFinancialYear facmfinancialyears;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TOBLBRNID", insertable = false, updatable = false)
    private ComBranch commbranch;

    // Getters and setters

    public FACTLedgerOpeningBalnceId getId() {
        return id;
    }

    public void setId(FACTLedgerOpeningBalnceId id) {
        this.id = id;
    }

    public FACMLedger getFacmledger() {
        return facmledger;
    }

    public void setFacmledger(FACMLedger facmledger) {
        this.facmledger = facmledger;
    }

    public FACMFinancialYear getFacmfinancialyears() {
        return facmfinancialyears;
    }

    public void setFacmfinancialyears(FACMFinancialYear facmfinancialyears) {
        this.facmfinancialyears = facmfinancialyears;
    }

    public ComBranch getCommbranch() {
        return commbranch;
    }

    public void setCommbranch(ComBranch commbranch) {
        this.commbranch = commbranch;
    }
}
