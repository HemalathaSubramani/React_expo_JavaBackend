package com.erp.test.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.*;

@SuppressWarnings("serial")
@Embeddable
public class HRMTPayfileId implements Serializable {

	
	@ManyToOne
    @JoinColumn(name = "TPAYEMPID")
    private HRMMEmployee hrmmemployee;

    @Column(name = "TPAYMONTHYEAR")
    private Date tpaymonthyear;

    @Column(name = "TPAYBASIC")
    private Double tpaybasic;

    @Column(name = "TPAYDA")
    private Double tpayda;

    @Column(name = "TPAYHRA")
    private Double tpayhra;

    @Column(name = "TPAYCCA")
    private Double tpaycca;

    @Column(name = "TPAYMA")
    private Double tpayma;

    @Column(name = "TPAYDAYS")
    private Double tpaydays;

    @Column(name = "TPAYLOPDAYS")
    private Double tpaylopdays;

    @Column(name = "TPAYEARNEDBASIC")
    private Double tpayearnedbasic;

    @Column(name = "TPAYDAARREARS")
    private Double tpaydaarrears;

    @Column(name = "TPAYEARNEDDA")
    private Double tpayearnedda;

    @Column(name = "TPAYEARNEDHRA")
    private Double tpayearnedhra;

    @Column(name = "TPAYEARNEDCCA")
    private Double tpayearnedcca;

    @Column(name = "TPAYEARNEDMA")
    private Double tpayearnedma;

    @Column(name = "TPAYOTHEREARNINGS")
    private Double tpayotherearnings;

    @Column(name = "TPAYGROSS")
    private Double tpaygross;

    @Column(name = "TPAYESIC")
    private Double tpayesic;

    @Column(name = "TPAYEPFC")
    private Double tpayepfc;

    @Column(name = "TPAYPTAX")
    private Double tpayptax;

    @Column(name = "TPAYINCOMETAX")
    private Double tpayincometax;

    @Column(name = "TPAYSWLOAN")
    private Double tpayswloan;

    @Column(name = "TPAYSALADVANCE")
    private Double tpaysaladvance;

    @Column(name = "TPAYLWF")
    private Double tpaylwf;

    @Column(name = "TPAYOTHERDEDUCTIONS")
    private Double tpayotherdeductions;

    @Column(name = "TPAYRECOVERIES")
    private Double tpayrecoveries;

    @Column(name = "TPAYNETAMOUNT")
    private Double tpaynetamount;

    @Column(name = "TPAYIR")
    private Double tpayir;

    @Column(name = "TPAYEARNEDIR")
    private Double tpayearnedir;

    @ManyToOne
    @JoinColumn(name = "TPAYBRNID")
    private ComBranch commbranch;

    @Column(name = "TPAYLOANADJUSTMENT")
    private Double tpayloanadjustment;

    @Column(name = "TPAYIP")
    private String tpayip;

    @Column(name = "TPAYMODDATE")
    private java.sql.Timestamp tpaymoddate;

    @ManyToOne
    @JoinColumn(name = "TPAYUSERNAME")
    private COMMAuthentication commauthentication;

//    @ManyToOne
//    @JoinColumn(name = "TPAYEGRID")
//    private HRMMEmpgroup hrmmempgroup;
//
//    @ManyToOne
//    @JoinColumn(name = "TPAYNOWID")
//    private HRMMNatureofwork hrmmnatureofwork;

    @Column(name = "TPAYINSURANCE")
    private Double tpayinsurance;

    @Column(name = "TPAYINSURANCEADJ")
    private Double tpayinsuranceadj;

    @Column(name = "TPAYVARIABLEPAY")
    private Double tpayvariablepay;

    @Column(name = "TPAYEARNEDVARIABLEPAY")
    private Double tpayearnedvariablepay;

    @Column(name = "TPAYTRANSPORTALLOW")
    private Double tpaytransportallow;

    @Column(name = "TPAYEARNEDTRANSPORTALLOW")
    private Double tpayearnedtransportallow;

    // Getters and Setters for all fields

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HRMTPayfileId that = (HRMTPayfileId) o;
        return Objects.equals(hrmmemployee, that.hrmmemployee) &&
               Objects.equals(tpaymonthyear, that.tpaymonthyear) &&
               Objects.equals(tpaybasic, that.tpaybasic) &&
               Objects.equals(tpayda, that.tpayda) &&
               Objects.equals(tpayhra, that.tpayhra) &&
               Objects.equals(tpaycca, that.tpaycca) &&
               Objects.equals(tpayma, that.tpayma) &&
               Objects.equals(tpaydays, that.tpaydays) &&
               Objects.equals(tpaylopdays, that.tpaylopdays) &&
               Objects.equals(tpayearnedbasic, that.tpayearnedbasic) &&
               Objects.equals(tpaydaarrears, that.tpaydaarrears) &&
               Objects.equals(tpayearnedda, that.tpayearnedda) &&
               Objects.equals(tpayearnedhra, that.tpayearnedhra) &&
               Objects.equals(tpayearnedcca, that.tpayearnedcca) &&
               Objects.equals(tpayearnedma, that.tpayearnedma) &&
               Objects.equals(tpayotherearnings, that.tpayotherearnings) &&
               Objects.equals(tpaygross, that.tpaygross) &&
               Objects.equals(tpayesic, that.tpayesic) &&
               Objects.equals(tpayepfc, that.tpayepfc) &&
               Objects.equals(tpayptax, that.tpayptax) &&
               Objects.equals(tpayincometax, that.tpayincometax) &&
               Objects.equals(tpayswloan, that.tpayswloan) &&
               Objects.equals(tpaysaladvance, that.tpaysaladvance) &&
               Objects.equals(tpaylwf, that.tpaylwf) &&
               Objects.equals(tpayotherdeductions, that.tpayotherdeductions) &&
               Objects.equals(tpayrecoveries, that.tpayrecoveries) &&
               Objects.equals(tpaynetamount, that.tpaynetamount) &&
               Objects.equals(tpayir, that.tpayir) &&
               Objects.equals(tpayearnedir, that.tpayearnedir) &&
               Objects.equals(tpayloanadjustment, that.tpayloanadjustment) &&
               Objects.equals(tpayip, that.tpayip) &&
               Objects.equals(tpaymoddate, that.tpaymoddate) &&
               Objects.equals(tpayinsurance, that.tpayinsurance) &&
               Objects.equals(tpayinsuranceadj, that.tpayinsuranceadj) &&
               Objects.equals(tpayvariablepay, that.tpayvariablepay) &&
               Objects.equals(tpayearnedvariablepay, that.tpayearnedvariablepay) &&
               Objects.equals(tpaytransportallow, that.tpaytransportallow) &&
               Objects.equals(tpayearnedtransportallow, that.tpayearnedtransportallow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hrmmemployee, tpaymonthyear, tpaybasic, tpayda, tpayhra, tpaycca, tpayma,
                tpaydays, tpaylopdays, tpayearnedbasic, tpaydaarrears, tpayearnedda, tpayearnedhra,
                tpayearnedcca, tpayearnedma, tpayotherearnings, tpaygross, tpayesic, tpayepfc, tpayptax,
                tpayincometax, tpayswloan, tpaysaladvance, tpaylwf, tpayotherdeductions, tpayrecoveries,
                tpaynetamount, tpayir, tpayearnedir, tpayloanadjustment, tpayip, tpaymoddate, tpayinsurance,
                tpayinsuranceadj, tpayvariablepay, tpayearnedvariablepay, tpaytransportallow,
                tpayearnedtransportallow);
    }

}
