package com.erp.test.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import jakarta.persistence.*;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ADVTDebitCreditNotesId implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
    @JoinColumn(name = "TDCEAMAID")
    private ADVMAgencyMaster advmagencymaster;

    @Temporal(TemporalType.DATE)
    @Column(name = "TDCEDATE")
    private Date tdcedate;

    @Column(name = "TDCEDESCID")
    private String tdcedescid;

    @Column(name = "TDCEAMOUNT", precision = 12)
    private Double tdceamount;

    @Column(name = "TDCEPENDING", precision = 12)
    private Double tdcepending;

    @Column(name = "TDCECLMID")
    private String tdceclmid;

    @Column(name = "TDCECLIENTNAME")
    private String tdceclientname;

    @Column(name = "TDCELEDGER")
    private String tdceledger;

    @Column(name = "TDCEBILLFORMAT")
    private String tdcebillformat;

    @Column(name = "TDCEREMARKS")
    private String tdceremarks;

    @Column(name = "TDCEBILLNUMBER")
    private String tdcebillnumber;

    @Column(name = "TDCEREFERENCE")
    private String tdcereference;

    @Temporal(TemporalType.DATE)
    @Column(name = "TDCECOMMOKAYDATE")
    private Date tdcecommokaydate;

    @Column(name = "TDCECOMMTOADJUST")
    private String tdcecommtoadjust;

    @Column(name = "TDCECOMMADJUSTED")
    private String tdcecommadjusted;

    @Column(name = "TDCEDEBITCREDITNUMBER")
    private String tdcedebitcreditnumber;

    @Column(name = "TDCETYPEDEBITCREDIT")
    private String tdcetypedebitcredit;

    @Column(name = "TDCEOKAYED")
    private String tdceokayed;

    @Column(name = "TDCELATEPAYDNNO")
    private String tdcelatepaydnno;

    @ManyToOne
    @JoinColumn(name = "TDCEBRNID")
    private ComBranch commbranch;

    @Column(name = "TDCESERVICETAXPER", precision = 5)
    private Double tdceservicetaxper;

    @Column(name = "TDCESERVICETAXAMOUNT", precision = 10)
    private Double tdceservicetaxamount;

    @Column(name = "TDCEBILLWISEORCATGROUPWISE")
    private String tdcebillwiseorcatgroupwise;

//    @ManyToOne
//    @JoinColumn(name = "TDCECGMID")
//    private ADVCategoryGroupMaster advmcategorygroupmaster;

    @Temporal(TemporalType.DATE)
    @Column(name = "TDCEAPPLICABLEDATE")
    private Date tdceapplicabledate;

    @Column(name = "TDCEACTIONTAKEN")
    private String tdceactiontaken;

    @Temporal(TemporalType.DATE)
    @Column(name = "TDCEDUEDATE")
    private Date tdceduedate;

    @Column(name = "TDCELOCALGROUP")
    private String tdcelocalgroup;

    @ManyToOne
    @JoinColumn(name = "TDCEUSERNAME")
    private COMMAuthentication commauthentication;

    @Column(name = "TDCEMODDATE")
    private java.sql.Timestamp tdcemoddate;

    @Column(name = "TDCEIP")
    private String tdceip;

    @Column(name = "TDCEBEFOREGSTAMT", precision = 12)
    private Double tdcebeforegstamt;

    @Column(name = "TDCEIGSTAMT", precision = 10)
    private Double tdceigstamt;

    @Column(name = "TDCEIGSTPER", precision = 7)
    private Double tdceigstper;

    @Column(name = "TDCESGSTAMT", precision = 10)
    private Double tdcesgstamt;

    @Column(name = "TDCESGSTPER", precision = 7)
    private Double tdcesgstper;

    @Column(name = "TDCECGSTAMT", precision = 10)
    private Double tdcecgstamt;

    @Column(name = "TDCECGSTPER", precision = 7)
    private Double tdcecgstper;

    @Column(name = "TDCEBILLTYPE")
    private String tdcebilltype;

    @Temporal(TemporalType.DATE)
    @Column(name = "TDCEBILLDATE")
    private Date tdcebilldate;

    @Column(name = "TDCEFOLIO")
    private String tdcefolio;

    @Column(name = "TDCELINKREFNO")
    private String tdcelinkrefno;

	public ADVMAgencyMaster getAdvmagencymaster() {
		return advmagencymaster;
	}

	public void setAdvmagencymaster(ADVMAgencyMaster advmagencymaster) {
		this.advmagencymaster = advmagencymaster;
	}

	public Date getTdcedate() {
		return tdcedate;
	}

	public void setTdcedate(Date tdcedate) {
		this.tdcedate = tdcedate;
	}

	public String getTdcedescid() {
		return tdcedescid;
	}

	public void setTdcedescid(String tdcedescid) {
		this.tdcedescid = tdcedescid;
	}

	public Double getTdceamount() {
		return tdceamount;
	}

	public void setTdceamount(Double tdceamount) {
		this.tdceamount = tdceamount;
	}

	public Double getTdcepending() {
		return tdcepending;
	}

	public void setTdcepending(Double tdcepending) {
		this.tdcepending = tdcepending;
	}

	public String getTdceclmid() {
		return tdceclmid;
	}

	public void setTdceclmid(String tdceclmid) {
		this.tdceclmid = tdceclmid;
	}

	public String getTdceclientname() {
		return tdceclientname;
	}

	public void setTdceclientname(String tdceclientname) {
		this.tdceclientname = tdceclientname;
	}

	public String getTdceledger() {
		return tdceledger;
	}

	public void setTdceledger(String tdceledger) {
		this.tdceledger = tdceledger;
	}

	public String getTdcebillformat() {
		return tdcebillformat;
	}

	public void setTdcebillformat(String tdcebillformat) {
		this.tdcebillformat = tdcebillformat;
	}

	public String getTdceremarks() {
		return tdceremarks;
	}

	public void setTdceremarks(String tdceremarks) {
		this.tdceremarks = tdceremarks;
	}

	public String getTdcebillnumber() {
		return tdcebillnumber;
	}

	public void setTdcebillnumber(String tdcebillnumber) {
		this.tdcebillnumber = tdcebillnumber;
	}

	public String getTdcereference() {
		return tdcereference;
	}

	public void setTdcereference(String tdcereference) {
		this.tdcereference = tdcereference;
	}

	public Date getTdcecommokaydate() {
		return tdcecommokaydate;
	}

	public void setTdcecommokaydate(Date tdcecommokaydate) {
		this.tdcecommokaydate = tdcecommokaydate;
	}

	public String getTdcecommtoadjust() {
		return tdcecommtoadjust;
	}

	public void setTdcecommtoadjust(String tdcecommtoadjust) {
		this.tdcecommtoadjust = tdcecommtoadjust;
	}

	public String getTdcecommadjusted() {
		return tdcecommadjusted;
	}

	public void setTdcecommadjusted(String tdcecommadjusted) {
		this.tdcecommadjusted = tdcecommadjusted;
	}

	public String getTdcedebitcreditnumber() {
		return tdcedebitcreditnumber;
	}

	public void setTdcedebitcreditnumber(String tdcedebitcreditnumber) {
		this.tdcedebitcreditnumber = tdcedebitcreditnumber;
	}

	public String getTdcetypedebitcredit() {
		return tdcetypedebitcredit;
	}

	public void setTdcetypedebitcredit(String tdcetypedebitcredit) {
		this.tdcetypedebitcredit = tdcetypedebitcredit;
	}

	public String getTdceokayed() {
		return tdceokayed;
	}

	public void setTdceokayed(String tdceokayed) {
		this.tdceokayed = tdceokayed;
	}

	public String getTdcelatepaydnno() {
		return tdcelatepaydnno;
	}

	public void setTdcelatepaydnno(String tdcelatepaydnno) {
		this.tdcelatepaydnno = tdcelatepaydnno;
	}

	public ComBranch getCommbranch() {
		return commbranch;
	}

	public void setCommbranch(ComBranch commbranch) {
		this.commbranch = commbranch;
	}

	public Double getTdceservicetaxper() {
		return tdceservicetaxper;
	}

	public void setTdceservicetaxper(Double tdceservicetaxper) {
		this.tdceservicetaxper = tdceservicetaxper;
	}

	public Double getTdceservicetaxamount() {
		return tdceservicetaxamount;
	}

	public void setTdceservicetaxamount(Double tdceservicetaxamount) {
		this.tdceservicetaxamount = tdceservicetaxamount;
	}

	public String getTdcebillwiseorcatgroupwise() {
		return tdcebillwiseorcatgroupwise;
	}

	public void setTdcebillwiseorcatgroupwise(String tdcebillwiseorcatgroupwise) {
		this.tdcebillwiseorcatgroupwise = tdcebillwiseorcatgroupwise;
	}

	public Date getTdceapplicabledate() {
		return tdceapplicabledate;
	}

	public void setTdceapplicabledate(Date tdceapplicabledate) {
		this.tdceapplicabledate = tdceapplicabledate;
	}

	public String getTdceactiontaken() {
		return tdceactiontaken;
	}

	public void setTdceactiontaken(String tdceactiontaken) {
		this.tdceactiontaken = tdceactiontaken;
	}

	public Date getTdceduedate() {
		return tdceduedate;
	}

	public void setTdceduedate(Date tdceduedate) {
		this.tdceduedate = tdceduedate;
	}

	public String getTdcelocalgroup() {
		return tdcelocalgroup;
	}

	public void setTdcelocalgroup(String tdcelocalgroup) {
		this.tdcelocalgroup = tdcelocalgroup;
	}

	public COMMAuthentication getCommauthentication() {
		return commauthentication;
	}

	public void setCommauthentication(COMMAuthentication commauthentication) {
		this.commauthentication = commauthentication;
	}

	public java.sql.Timestamp getTdcemoddate() {
		return tdcemoddate;
	}

	public void setTdcemoddate(java.sql.Timestamp tdcemoddate) {
		this.tdcemoddate = tdcemoddate;
	}

	public String getTdceip() {
		return tdceip;
	}

	public void setTdceip(String tdceip) {
		this.tdceip = tdceip;
	}

	public Double getTdcebeforegstamt() {
		return tdcebeforegstamt;
	}

	public void setTdcebeforegstamt(Double tdcebeforegstamt) {
		this.tdcebeforegstamt = tdcebeforegstamt;
	}

	public Double getTdceigstamt() {
		return tdceigstamt;
	}

	public void setTdceigstamt(Double tdceigstamt) {
		this.tdceigstamt = tdceigstamt;
	}

	public Double getTdceigstper() {
		return tdceigstper;
	}

	public void setTdceigstper(Double tdceigstper) {
		this.tdceigstper = tdceigstper;
	}

	public Double getTdcesgstamt() {
		return tdcesgstamt;
	}

	public void setTdcesgstamt(Double tdcesgstamt) {
		this.tdcesgstamt = tdcesgstamt;
	}

	public Double getTdcesgstper() {
		return tdcesgstper;
	}

	public void setTdcesgstper(Double tdcesgstper) {
		this.tdcesgstper = tdcesgstper;
	}

	public Double getTdcecgstamt() {
		return tdcecgstamt;
	}

	public void setTdcecgstamt(Double tdcecgstamt) {
		this.tdcecgstamt = tdcecgstamt;
	}

	public Double getTdcecgstper() {
		return tdcecgstper;
	}

	public void setTdcecgstper(Double tdcecgstper) {
		this.tdcecgstper = tdcecgstper;
	}

	public String getTdcebilltype() {
		return tdcebilltype;
	}

	public void setTdcebilltype(String tdcebilltype) {
		this.tdcebilltype = tdcebilltype;
	}

	public Date getTdcebilldate() {
		return tdcebilldate;
	}

	public void setTdcebilldate(Date tdcebilldate) {
		this.tdcebilldate = tdcebilldate;
	}

	public String getTdcefolio() {
		return tdcefolio;
	}

	public void setTdcefolio(String tdcefolio) {
		this.tdcefolio = tdcefolio;
	}

	public String getTdcelinkrefno() {
		return tdcelinkrefno;
	}

	public void setTdcelinkrefno(String tdcelinkrefno) {
		this.tdcelinkrefno = tdcelinkrefno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(advmagencymaster, commauthentication, commbranch, tdceactiontaken, tdceamount,
				tdceapplicabledate, tdcebeforegstamt, tdcebilldate, tdcebillformat, tdcebillnumber, tdcebilltype,
				tdcebillwiseorcatgroupwise, tdcecgstamt, tdcecgstper, tdceclientname, tdceclmid, tdcecommadjusted,
				tdcecommokaydate, tdcecommtoadjust, tdcedate, tdcedebitcreditnumber, tdcedescid, tdceduedate, tdcefolio,
				tdceigstamt, tdceigstper, tdceip, tdcelatepaydnno, tdceledger, tdcelinkrefno, tdcelocalgroup,
				tdcemoddate, tdceokayed, tdcepending, tdcereference, tdceremarks, tdceservicetaxamount,
				tdceservicetaxper, tdcesgstamt, tdcesgstper, tdcetypedebitcredit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ADVTDebitCreditNotesId other = (ADVTDebitCreditNotesId) obj;
		return Objects.equals(advmagencymaster, other.advmagencymaster)
				&& Objects.equals(commauthentication, other.commauthentication)
				&& Objects.equals(commbranch, other.commbranch)
				&& Objects.equals(tdceactiontaken, other.tdceactiontaken)
				&& Objects.equals(tdceamount, other.tdceamount)
				&& Objects.equals(tdceapplicabledate, other.tdceapplicabledate)
				&& Objects.equals(tdcebeforegstamt, other.tdcebeforegstamt)
				&& Objects.equals(tdcebilldate, other.tdcebilldate)
				&& Objects.equals(tdcebillformat, other.tdcebillformat)
				&& Objects.equals(tdcebillnumber, other.tdcebillnumber)
				&& Objects.equals(tdcebilltype, other.tdcebilltype)
				&& Objects.equals(tdcebillwiseorcatgroupwise, other.tdcebillwiseorcatgroupwise)
				&& Objects.equals(tdcecgstamt, other.tdcecgstamt) && Objects.equals(tdcecgstper, other.tdcecgstper)
				&& Objects.equals(tdceclientname, other.tdceclientname) && Objects.equals(tdceclmid, other.tdceclmid)
				&& Objects.equals(tdcecommadjusted, other.tdcecommadjusted)
				&& Objects.equals(tdcecommokaydate, other.tdcecommokaydate)
				&& Objects.equals(tdcecommtoadjust, other.tdcecommtoadjust) && Objects.equals(tdcedate, other.tdcedate)
				&& Objects.equals(tdcedebitcreditnumber, other.tdcedebitcreditnumber)
				&& Objects.equals(tdcedescid, other.tdcedescid) && Objects.equals(tdceduedate, other.tdceduedate)
				&& Objects.equals(tdcefolio, other.tdcefolio) && Objects.equals(tdceigstamt, other.tdceigstamt)
				&& Objects.equals(tdceigstper, other.tdceigstper) && Objects.equals(tdceip, other.tdceip)
				&& Objects.equals(tdcelatepaydnno, other.tdcelatepaydnno)
				&& Objects.equals(tdceledger, other.tdceledger) && Objects.equals(tdcelinkrefno, other.tdcelinkrefno)
				&& Objects.equals(tdcelocalgroup, other.tdcelocalgroup)
				&& Objects.equals(tdcemoddate, other.tdcemoddate) && Objects.equals(tdceokayed, other.tdceokayed)
				&& Objects.equals(tdcepending, other.tdcepending) && Objects.equals(tdcereference, other.tdcereference)
				&& Objects.equals(tdceremarks, other.tdceremarks)
				&& Objects.equals(tdceservicetaxamount, other.tdceservicetaxamount)
				&& Objects.equals(tdceservicetaxper, other.tdceservicetaxper)
				&& Objects.equals(tdcesgstamt, other.tdcesgstamt) && Objects.equals(tdcesgstper, other.tdcesgstper)
				&& Objects.equals(tdcetypedebitcredit, other.tdcetypedebitcredit);
	}
    
    

}
