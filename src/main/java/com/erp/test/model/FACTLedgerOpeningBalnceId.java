package com.erp.test.model;


import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;
import jakarta.persistence.Embeddable;


@Embeddable
public class FACTLedgerOpeningBalnceId implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "TOBLLDGID")
    private Long facmledgerId;

    @Column(name = "TOBLDB")
    private Double tobdlb;

    @Column(name = "TOBLCR")
    private Double toblcr;

    @Column(name = "TOBLFYRID")
    private Long facmfinancialyearId;

    @Column(name = "TOBLBRNID")
    private Long commbranchId;

    // Getters and setters

    public Long getFacmledgerId() {
        return facmledgerId;
    }

    public void setFacmledgerId(Long facmledgerId) {
        this.facmledgerId = facmledgerId;
    }

    public Double getTobdlb() {
        return tobdlb;
    }

    public void setTobdlb(Double tobdlb) {
        this.tobdlb = tobdlb;
    }

    public Double getToblcr() {
        return toblcr;
    }

    public void setToblcr(Double toblcr) {
        this.toblcr = toblcr;
    }

    public Long getFacmfinancialyearId() {
        return facmfinancialyearId;
    }

    public void setFacmfinancialyearId(Long facmfinancialyearId) {
        this.facmfinancialyearId = facmfinancialyearId;
    }

    public Long getCommbranchId() {
        return commbranchId;
    }

    public void setCommbranchId(Long commbranchId) {
        this.commbranchId = commbranchId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FACTLedgerOpeningBalnceId that = (FACTLedgerOpeningBalnceId) o;
        return facmledgerId.equals(that.facmledgerId) &&
               tobdlb.equals(that.tobdlb) &&
               toblcr.equals(that.toblcr) &&
               facmfinancialyearId.equals(that.facmfinancialyearId) &&
               commbranchId.equals(that.commbranchId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(facmledgerId, tobdlb, toblcr, facmfinancialyearId, commbranchId);
    }
}

