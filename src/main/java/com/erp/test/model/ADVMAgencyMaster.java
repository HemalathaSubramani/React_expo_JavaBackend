package com.erp.test.model;

import jakarta.persistence.Entity;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "ADVMAGENCYMASTER")
public class ADVMAgencyMaster {

    @Id
    @Column(name = "MAMAID")
    private String mamaid;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "MAMARMAID")
//    private ADVRegionMaster advmregionmaster;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "MAMAPOSID")
//    private com.cmn.hibernatebean.ComPostCode commpostcode;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "MAMACITID")
//    private com.cmn.hibernatebean.ComCity commcity;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "MAMASTRID")
//    private ADVMStatusMaster advmstatusmaster;

    @Column(name = "MAMANAME")
    private String mamaname;

    @Column(name = "MAMAADDRESS1")
    private String mamaaddress1;

    @Column(name = "MAMAADDRESS2")
    private String mamaaddress2;

    @Column(name = "MAMAADDRESS3")
    private String mamaaddress3;

    @Column(name = "MAMAPHONE")
    private String mamaphone;

    @Column(name = "MAMAFAX")
    private String mamafax;

    @Column(name = "MAMAEMAIL")
    private String mamaemail;

    @Column(name = "MAMATRADEDISCOUNT", precision = 12)
    private Double mamatradediscount;

    @Column(name = "MAMACREDITPERIOD")
    private String mamacreditperiod;

    @Column(name = "MAMAGOVERNMENT")
    private String mamagovernment;

    @Column(name = "MAMADAVP")
    private String mamadavp;

    @Column(name = "MAMAACCREDITED")
    private String mamaaccredited;

    @Column(name = "MAMAINSID")
    private String mamainsid;

    @Column(name = "MAMAGROSSNETFREE")
    private String mamagrossnetfree;

    @Column(name = "MAMAUNDERAC")
    private String mamaunderac;

    @Column(name = "MAMADISACC")
    private String mamadisacc;

    @Temporal(TemporalType.DATE)
    @Column(name = "MAMADISDATE")
    private Date mamadisdate;

    @Column(name = "MAMAREASON")
    private String mamareason;

    @Column(name = "MAMAREQSTATISTICS")
    private String mamareqstatistics;

    @Column(name = "MAMACREDITLIMIT", precision = 12)
    private Double mamacreditlimit;

    @Column(name = "MAMANEWID")
    private String mamanewid;

    @Column(name = "MAMAUSERNAMEAGENCY", unique = true)
    private String mamausernameagency;

    @Column(name = "MAMAPASSWORDAGENCY")
    private String mamapasswordagency;

    @Column(name = "MAMAUSERNAME")
    private String mamausername;

    @Temporal(TemporalType.DATE)
    @Column(name = "MAMAMODDATE")
    private Date mamamoddate;

    @Temporal(TemporalType.DATE)
    @Column(name = "MAMAJOININGDATE")
    private Date mamajoiningdate;

    @Column(name = "MAMADUEDATETYPE")
    private String mamaduedatetype;

    @Column(name = "MAMABILLWISEDDCHANGE")
    private String mamabillwiseddchange;

    @Column(name = "MAMASTATUS")
    private String mamastatus;

    @Column(name = "MAMAREMARKS")
    private String mamaremarks;

    @Column(name = "MAMALINKID")
    private String mamalinkid;

    @Column(name = "MAMALINKIDDESC")
    private String mamalinkiddesc;

    @Column(name = "MAMABLOCKED")
    private String mamablocked;

    @Temporal(TemporalType.DATE)
    @Column(name = "MAMABLOCKEDDATE")
    private Date mamablockeddate;

    @Column(name = "MAMABLOCKEDREASON")
    private String mamablockedreason;

    @Column(name = "MAMAIP")
    private String mamaip;

    @Column(name = "MAMALPDNYESNO")
    private String mamalpdnyesno;

    @Column(name = "MAMAGSTNO")
    private String mamagstno;

    @Temporal(TemporalType.DATE)
    @Column(name = "MAMAGSTDATE")
    private Date mamagstdate;

    @Temporal(TemporalType.DATE)
    @Column(name = "MAMAGSTCANCELDATE")
    private Date mamagstcanceldate;

    @Column(name = "MAMALEGALNAME")
    private String mamalegalname;

    @Column(name = "MAMAFREEZEOPTIONS")
    private String mamafreezeoptions;

    @Column(name = "MAMAGSTTYPE")
    private String mamagsttype;

	public String getMamaid() {
		return mamaid;
	}

	public void setMamaid(String mamaid) {
		this.mamaid = mamaid;
	}

	public String getMamaname() {
		return mamaname;
	}

	public void setMamaname(String mamaname) {
		this.mamaname = mamaname;
	}

	public String getMamaaddress1() {
		return mamaaddress1;
	}

	public void setMamaaddress1(String mamaaddress1) {
		this.mamaaddress1 = mamaaddress1;
	}

	public String getMamaaddress2() {
		return mamaaddress2;
	}

	public void setMamaaddress2(String mamaaddress2) {
		this.mamaaddress2 = mamaaddress2;
	}

	public String getMamaaddress3() {
		return mamaaddress3;
	}

	public void setMamaaddress3(String mamaaddress3) {
		this.mamaaddress3 = mamaaddress3;
	}

	public String getMamaphone() {
		return mamaphone;
	}

	public void setMamaphone(String mamaphone) {
		this.mamaphone = mamaphone;
	}

	public String getMamafax() {
		return mamafax;
	}

	public void setMamafax(String mamafax) {
		this.mamafax = mamafax;
	}

	public String getMamaemail() {
		return mamaemail;
	}

	public void setMamaemail(String mamaemail) {
		this.mamaemail = mamaemail;
	}

	public Double getMamatradediscount() {
		return mamatradediscount;
	}

	public void setMamatradediscount(Double mamatradediscount) {
		this.mamatradediscount = mamatradediscount;
	}

	public String getMamacreditperiod() {
		return mamacreditperiod;
	}

	public void setMamacreditperiod(String mamacreditperiod) {
		this.mamacreditperiod = mamacreditperiod;
	}

	public String getMamagovernment() {
		return mamagovernment;
	}

	public void setMamagovernment(String mamagovernment) {
		this.mamagovernment = mamagovernment;
	}

	public String getMamadavp() {
		return mamadavp;
	}

	public void setMamadavp(String mamadavp) {
		this.mamadavp = mamadavp;
	}

	public String getMamaaccredited() {
		return mamaaccredited;
	}

	public void setMamaaccredited(String mamaaccredited) {
		this.mamaaccredited = mamaaccredited;
	}

	public String getMamainsid() {
		return mamainsid;
	}

	public void setMamainsid(String mamainsid) {
		this.mamainsid = mamainsid;
	}

	public String getMamagrossnetfree() {
		return mamagrossnetfree;
	}

	public void setMamagrossnetfree(String mamagrossnetfree) {
		this.mamagrossnetfree = mamagrossnetfree;
	}

	public String getMamaunderac() {
		return mamaunderac;
	}

	public void setMamaunderac(String mamaunderac) {
		this.mamaunderac = mamaunderac;
	}

	public String getMamadisacc() {
		return mamadisacc;
	}

	public void setMamadisacc(String mamadisacc) {
		this.mamadisacc = mamadisacc;
	}

	public Date getMamadisdate() {
		return mamadisdate;
	}

	public void setMamadisdate(Date mamadisdate) {
		this.mamadisdate = mamadisdate;
	}

	public String getMamareason() {
		return mamareason;
	}

	public void setMamareason(String mamareason) {
		this.mamareason = mamareason;
	}

	public String getMamareqstatistics() {
		return mamareqstatistics;
	}

	public void setMamareqstatistics(String mamareqstatistics) {
		this.mamareqstatistics = mamareqstatistics;
	}

	public Double getMamacreditlimit() {
		return mamacreditlimit;
	}

	public void setMamacreditlimit(Double mamacreditlimit) {
		this.mamacreditlimit = mamacreditlimit;
	}

	public String getMamanewid() {
		return mamanewid;
	}

	public void setMamanewid(String mamanewid) {
		this.mamanewid = mamanewid;
	}

	public String getMamausernameagency() {
		return mamausernameagency;
	}

	public void setMamausernameagency(String mamausernameagency) {
		this.mamausernameagency = mamausernameagency;
	}

	public String getMamapasswordagency() {
		return mamapasswordagency;
	}

	public void setMamapasswordagency(String mamapasswordagency) {
		this.mamapasswordagency = mamapasswordagency;
	}

	public String getMamausername() {
		return mamausername;
	}

	public void setMamausername(String mamausername) {
		this.mamausername = mamausername;
	}

	public Date getMamamoddate() {
		return mamamoddate;
	}

	public void setMamamoddate(Date mamamoddate) {
		this.mamamoddate = mamamoddate;
	}

	public Date getMamajoiningdate() {
		return mamajoiningdate;
	}

	public void setMamajoiningdate(Date mamajoiningdate) {
		this.mamajoiningdate = mamajoiningdate;
	}

	public String getMamaduedatetype() {
		return mamaduedatetype;
	}

	public void setMamaduedatetype(String mamaduedatetype) {
		this.mamaduedatetype = mamaduedatetype;
	}

	public String getMamabillwiseddchange() {
		return mamabillwiseddchange;
	}

	public void setMamabillwiseddchange(String mamabillwiseddchange) {
		this.mamabillwiseddchange = mamabillwiseddchange;
	}

	public String getMamastatus() {
		return mamastatus;
	}

	public void setMamastatus(String mamastatus) {
		this.mamastatus = mamastatus;
	}

	public String getMamaremarks() {
		return mamaremarks;
	}

	public void setMamaremarks(String mamaremarks) {
		this.mamaremarks = mamaremarks;
	}

	public String getMamalinkid() {
		return mamalinkid;
	}

	public void setMamalinkid(String mamalinkid) {
		this.mamalinkid = mamalinkid;
	}

	public String getMamalinkiddesc() {
		return mamalinkiddesc;
	}

	public void setMamalinkiddesc(String mamalinkiddesc) {
		this.mamalinkiddesc = mamalinkiddesc;
	}

	public String getMamablocked() {
		return mamablocked;
	}

	public void setMamablocked(String mamablocked) {
		this.mamablocked = mamablocked;
	}

	public Date getMamablockeddate() {
		return mamablockeddate;
	}

	public void setMamablockeddate(Date mamablockeddate) {
		this.mamablockeddate = mamablockeddate;
	}

	public String getMamablockedreason() {
		return mamablockedreason;
	}

	public void setMamablockedreason(String mamablockedreason) {
		this.mamablockedreason = mamablockedreason;
	}

	public String getMamaip() {
		return mamaip;
	}

	public void setMamaip(String mamaip) {
		this.mamaip = mamaip;
	}

	public String getMamalpdnyesno() {
		return mamalpdnyesno;
	}

	public void setMamalpdnyesno(String mamalpdnyesno) {
		this.mamalpdnyesno = mamalpdnyesno;
	}

	public String getMamagstno() {
		return mamagstno;
	}

	public void setMamagstno(String mamagstno) {
		this.mamagstno = mamagstno;
	}

	public Date getMamagstdate() {
		return mamagstdate;
	}

	public void setMamagstdate(Date mamagstdate) {
		this.mamagstdate = mamagstdate;
	}

	public Date getMamagstcanceldate() {
		return mamagstcanceldate;
	}

	public void setMamagstcanceldate(Date mamagstcanceldate) {
		this.mamagstcanceldate = mamagstcanceldate;
	}

	public String getMamalegalname() {
		return mamalegalname;
	}

	public void setMamalegalname(String mamalegalname) {
		this.mamalegalname = mamalegalname;
	}

	public String getMamafreezeoptions() {
		return mamafreezeoptions;
	}

	public void setMamafreezeoptions(String mamafreezeoptions) {
		this.mamafreezeoptions = mamafreezeoptions;
	}

	public String getMamagsttype() {
		return mamagsttype;
	}

	public void setMamagsttype(String mamagsttype) {
		this.mamagsttype = mamagsttype;
	}

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "MAMAGSSID")
//    private com.cmn.hibernatebean.CommGSTState commgststate;
//
//    @OneToMany(mappedBy = "advmagencymaster", fetch = FetchType.LAZY)
//    private Set<ADVRoheader> advagency;
//
//    @OneToMany(mappedBy = "advmagencymaster", fetch = FetchType.LAZY)
//    private Set<ADVTCollectionHeader> advcollection;
//
//    @OneToMany(mappedBy = "advmagencymaster", fetch = FetchType.LAZY)
//    private Set<ADVTDebitMemo> advdebitmemo;
//
//    @OneToMany(mappedBy = "advmagencymaster", fetch = FetchType.LAZY)
//    private Set<ADVTDebitCreditNotes> advDebitCreditAgency

    
    
    
}
