package com.erp.test.model;

import jakarta.persistence.*;
import jakarta.persistence.JoinColumn;


@Entity
@Table(name = "HRMTPAYFILE")
public class HRMTPayfile {

	@EmbeddedId
    private HRMTPayfileId id;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TPAYEMPID", referencedColumnName = "MEMPID", insertable = false, updatable = false)
    private HRMMEmployee hrmmemployee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TPAYBRNID", referencedColumnName = "MBRNID", insertable = false, updatable = false)
    private ComBranch commbranch;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TPAYUSERNAME", referencedColumnName = "MAUTUSERNAME", insertable = false, updatable = false)
    private COMMAuthentication commauthentication;

    public HRMMEmployee getHrmmemployee() {
        return hrmmemployee;
    }

    public void setHrmmemployee(HRMMEmployee hrmmemployee) {
        this.hrmmemployee = hrmmemployee;
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

}
