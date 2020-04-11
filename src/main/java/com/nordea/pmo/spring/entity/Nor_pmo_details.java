package com.nordea.pmo.spring.entity;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Nor_pmo_details")
public class Nor_pmo_details {

	@Id	
	@Column(name="PMO_ID")
	  private int PMO_ID;
	
	@Column(name="PHYSICAL_ACCESS")
	  private String PHYSICAL_ACCESS ;
	
	@Column(name="PHY_ACC_GRT_DT")
	  private String PHY_ACC_GRT_DT  ;
	
	@Column(name="PHY_ACC_RV_DT")
	  private String PHY_ACC_RV_DT ;
	
	@Column(name="LOGICAL_ACCESS")
	  private String LOGICAL_ACCESS ;
	
	@Column(name="LG_ACC_GRT_DT")
	  private Date LG_ACC_GRT_DT ;
	
	@Column(name="LG_ACC_RV_DT")
	  private Date LG_ACC_RV_DT  ;
	
	@Column(name="BIOMETRIC_ACCESS")
	  private String BIOMETRIC_ACCESS;
	
	@Column(name="BIO_ACC_GRT_DT")
	  private Date BIO_ACC_GRT_DT  ;
	
	@Column(name="BIO_ACC_RV_DT")
	  private Date BIO_ACC_RV_DT ;
	
	@Column(name="NOR_IND")
	  private String NOR_IND ;
	
	@Column(name="NOR_IND_DATE")
	  private Date NOR_IND_DATE;
	
	@Column(name="NOR_IND_ATTEMPT")
	  private int NOR_IND_ATTEMPT;
	
	@Column(name="CRIMINAL_BGV")
	  private String CRIMINAL_BGV ;
	
	@Column(name="CRIMINAL_BGV_DT")
	  private String CRIMINAL_BGV_DT;
	
	@Column(name="CRE_WR_BGV")
	  private String CRE_WR_BGV ;
	
	@Column(name="CRE_WR_BGV_DT")
	  private Date CRE_WR_BGV_DT ;
	
	@Column(name="EMP_BGV")
	  private String EMP_BGV ;
	
	@Column(name="EMP_BGV_DT")
	  private Date EMP_BGV_DT ;
	
	@Column(name="EDU_BGV")
	  private String EDU_BGV ;
	
	@Column(name="EDU_BGV_DT")
	  private Date EDU_BGV_DT ;
	
	@Column(name="START_DATE")
	  private Date START_DATE ;
	
	@Column(name="END_DATE")
	  private Date END_DATE ;
	
	@Column(name="MAKER_ID")
	  private int MAKER_ID ;
	
	@Column(name="STATUS")
	  private String STATUS;
	
	//Getters & Setters
	public int getPMO_ID() {
		return PMO_ID;
	}
	public void setPMO_ID(int pMO_ID) {
		PMO_ID = pMO_ID;
	}
	
	public String getPHYSICAL_ACCESS() {
		return PHYSICAL_ACCESS;
	}
	public void setPHYSICAL_ACCESS(String pHYSICAL_ACCESS) {
		PHYSICAL_ACCESS = pHYSICAL_ACCESS;
	}
	public String getPHY_ACC_GRT_DT() {
		return PHY_ACC_GRT_DT;
	}
	public void setPHY_ACC_GRT_DT(String pHY_ACC_GRT_DT) {
		PHY_ACC_GRT_DT = pHY_ACC_GRT_DT;
	}
	public String getPHY_ACC_RV_DT() {
		return PHY_ACC_RV_DT;
	}
	public void setPHY_ACC_RV_DT(String pHY_ACC_RV_DT) {
		PHY_ACC_RV_DT = pHY_ACC_RV_DT;
	}
	public String getLOGICAL_ACCESS() {
		return LOGICAL_ACCESS;
	}
	public void setLOGICAL_ACCESS(String lOGICAL_ACCESS) {
		LOGICAL_ACCESS = lOGICAL_ACCESS;
	}
	public Date getLG_ACC_GRT_DT() {
		return LG_ACC_GRT_DT;
	}
	public void setLG_ACC_GRT_DT(Date lG_ACC_GRT_DT) {
		LG_ACC_GRT_DT = lG_ACC_GRT_DT;
	}
	public Date getLG_ACC_RV_DT() {
		return LG_ACC_RV_DT;
	}
	public void setLG_ACC_RV_DT(Date lG_ACC_RV_DT) {
		LG_ACC_RV_DT = lG_ACC_RV_DT;
	}
	public String getBIOMETRIC_ACCESS() {
		return BIOMETRIC_ACCESS;
	}
	public void setBIOMETRIC_ACCESS(String bIOMETRIC_ACCESS) {
		BIOMETRIC_ACCESS = bIOMETRIC_ACCESS;
	}
	public Date getBIO_ACC_GRT_DT() {
		return BIO_ACC_GRT_DT;
	}
	public void setBIO_ACC_GRT_DT(Date bIO_ACC_GRT_DT) {
		BIO_ACC_GRT_DT = bIO_ACC_GRT_DT;
	}
	public Date getBIO_ACC_RV_DT() {
		return BIO_ACC_RV_DT;
	}
	public void setBIO_ACC_RV_DT(Date bIO_ACC_RV_DT) {
		BIO_ACC_RV_DT = bIO_ACC_RV_DT;
	}
	public String getNOR_IND() {
		return NOR_IND;
	}
	public void setNOR_IND(String nOR_IND) {
		NOR_IND = nOR_IND;
	}
	public Date getNOR_IND_DATE() {
		return NOR_IND_DATE;
	}
	public void setNOR_IND_DATE(Date nOR_IND_DATE) {
		NOR_IND_DATE = nOR_IND_DATE;
	}
	public int getNOR_IND_ATTEMPT() {
		return NOR_IND_ATTEMPT;
	}
	public void setNOR_IND_ATTEMPT(int nOR_IND_ATTEMPT) {
		NOR_IND_ATTEMPT = nOR_IND_ATTEMPT;
	}
	public String getCRIMINAL_BGV() {
		return CRIMINAL_BGV;
	}
	public void setCRIMINAL_BGV(String cRIMINAL_BGV) {
		CRIMINAL_BGV = cRIMINAL_BGV;
	}
	public String getCRIMINAL_BGV_DT() {
		return CRIMINAL_BGV_DT;
	}
	public void setCRIMINAL_BGV_DT(String cRIMINAL_BGV_DT) {
		CRIMINAL_BGV_DT = cRIMINAL_BGV_DT;
	}
	public String getCRE_WR_BGV() {
		return CRE_WR_BGV;
	}
	public void setCRE_WR_BGV(String cRE_WR_BGV) {
		CRE_WR_BGV = cRE_WR_BGV;
	}
	public Date getCRE_WR_BGV_DT() {
		return CRE_WR_BGV_DT;
	}
	public void setCRE_WR_BGV_DT(Date cRE_WR_BGV_DT) {
		CRE_WR_BGV_DT = cRE_WR_BGV_DT;
	}
	public String getEMP_BGV() {
		return EMP_BGV;
	}
	public void setEMP_BGV(String eMP_BGV) {
		EMP_BGV = eMP_BGV;
	}
	public Date getEMP_BGV_DT() {
		return EMP_BGV_DT;
	}
	public void setEMP_BGV_DT(Date eMP_BGV_DT) {
		EMP_BGV_DT = eMP_BGV_DT;
	}
	public String getEDU_BGV() {
		return EDU_BGV;
	}
	public void setEDU_BGV(String eDU_BGV) {
		EDU_BGV = eDU_BGV;
	}
	public Date getEDU_BGV_DT() {
		return EDU_BGV_DT;
	}
	public void setEDU_BGV_DT(Date eDU_BGV_DT) {
		EDU_BGV_DT = eDU_BGV_DT;
	}
	public Date getSTART_DATE() {
		return START_DATE;
	}
	public void setSTART_DATE(Date sTART_DATE) {
		START_DATE = sTART_DATE;
	}
	public Date getEND_DATE() {
		return END_DATE;
	}
	public void setEND_DATE(Date eND_DATE) {
		END_DATE = eND_DATE;
	}
	public int getMAKER_ID() {
		return MAKER_ID;
	}
	public void setMAKER_ID(int mAKER_ID) {
		MAKER_ID = mAKER_ID;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	@Override
	public String toString() {
		return "nor_pmo_details [PMO_ID=" + PMO_ID +", PHYSICAL_ACCESS=" + PHYSICAL_ACCESS
				+ ", PHY_ACC_GRT_DT=" + PHY_ACC_GRT_DT + ", PHY_ACC_RV_DT=" + PHY_ACC_RV_DT + ", LOGICAL_ACCESS="
				+ LOGICAL_ACCESS + ", LG_ACC_GRT_DT=" + LG_ACC_GRT_DT + ", LG_ACC_RV_DT=" + LG_ACC_RV_DT
				+ ", BIOMETRIC_ACCESS=" + BIOMETRIC_ACCESS + ", BIO_ACC_GRT_DT=" + BIO_ACC_GRT_DT + ", BIO_ACC_RV_DT="
				+ BIO_ACC_RV_DT + ", NOR_IND=" + NOR_IND + ", NOR_IND_DATE=" + NOR_IND_DATE + ", NOR_IND_ATTEMPT="
				+ NOR_IND_ATTEMPT + ", CRIMINAL_BGV=" + CRIMINAL_BGV + ", CRIMINAL_BGV_DT=" + CRIMINAL_BGV_DT
				+ ", CRE_WR_BGV=" + CRE_WR_BGV + ", CRE_WR_BGV_DT=" + CRE_WR_BGV_DT + ", EMP_BGV=" + EMP_BGV
				+ ", EMP_BGV_DT=" + EMP_BGV_DT + ", EDU_BGV=" + EDU_BGV + ", EDU_BGV_DT=" + EDU_BGV_DT + ", START_DATE="
				+ START_DATE + ", END_DATE=" + END_DATE + ", MAKER_ID=" + MAKER_ID + ", STATUS=" + STATUS + "]";
	}
	  
	@OneToOne(cascade=CascadeType.DETACH)
	@JoinColumn(name="PS_NO")
	  private Nor_emp_details nor_emp_details;
	
	public Nor_emp_details getNor_emp_details() {
		return nor_emp_details;
	}
	public void setNor_emp_details(Nor_emp_details nor_emp_details) {
		this.nor_emp_details = nor_emp_details;
	}
	
}
