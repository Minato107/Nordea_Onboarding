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
@Table(name="Nor_onboarding_details")
public class Nor_onboarding_details {
	
	  @Id
	  @Column(name="ONBOARD_ID")
	  private int ONBOARD_ID;  
	  
	  @Column(name="PR_NO")
	  private String PR_NO  ;
	  
	  @Column(name="OPP_ID")
	  private String OPP_ID  ;
	  
	  @Column(name="LATERAL_HIRE")
	  private String LATERAL_HIRE  ;
	  
	  @Column(name="TRANSFER_INIT")
	  private String TRANSFER_INIT ;
	  
	  @Column(name="BUSS_UNIT")
	  private String BUSS_UNIT; 
	  
	  @Column(name="CADRE")
	  private String CADRE  ;
	  
	  @Column(name="DEPT")
	  private String DEPT  ;
	  
	  @Column(name="BUSS_AREA")
	  private String BUSS_AREA  ;
	  
	  @Column(name="BUSS_AREA_GRP")
	  private String BUSS_AREA_GRP ;
	  
	  @Column(name="SITE")
	  private String SITE ;
	  
	  @Column(name="WORK_LOC_COUNTRY")
	  private String WORK_LOC_COUNTRY;
	  
	  @Column(name="WORK_LOC_CITY")
	  private String WORK_LOC_CITY  ;
	  
	  @Column(name="PRJ_COA_CONTRY")
	  private String PRJ_COA_CONTRY  ;
	  
	  @Column(name="RM_PROFILE_REVD")
	  private String RM_PROFILE_REVD  ;
	  
	  @Column(name="CLIENT_PROFILE_SHRD")
	  private String CLIENT_PROFILE_SHRD;
	  
	  @Column(name="CLIENT_INT_DATE")
	  private Date CLIENT_INT_DATE;
	  
	  @Column(name="CONF_DATE")
	  private Date CONF_DATE  ;
	  
	  @Column(name="BILLED_STATUS")
	  private String BILLED_STATUS ;
	  
	  @Column(name="BILL_START_DATE")
	  private Date BILL_START_DATE;
	  
	  @Column(name="BILL_END_DATE")
	  private Date BILL_END_DATE ;
	  
	  @Column(name="NIID_APP_ID")
	  private String NIID_APP_ID;
	  
	  @Column(name="G_LOGON_ID")
	  private String G_LOGON_ID;
	  
	  @Column(name="NOR_MGR")
	  private String NOR_MGR  ;
	  
	  @Column(name="NOR_COA")
	  private String NOR_COA  ;
	  
	  @Column(name="ADD_REPLACE")
	  private String ADD_REPLACE;
	  
	  @Column(name="REP_NAME")
	  private String REP_NAME  ;
	  
	  @Column(name="REP_ASS_LST_DATE")
	  private Date REP_ASS_LST_DATE;
	  
	  @Column(name="PM_NAME")
	  private String PM_NAME  ;
	  
	  @Column(name="DM_NAME")
	  private String DM_NAME  ;
	  
	  @Column(name="LTI_JOIN_DATE")
	  private Date LTI_JOIN_DATE ;
	  
	  @Column(name="NOR_JOIN_DATE")
	  private Date NOR_JOIN_DATE;
	  
	  @Column(name="NDA_RCVD")
	  private String NDA_RCVD  ;
	  
	  @Column(name="NDA_UPLOAD")
	  private String NDA_UPLOAD  ;
	  
	  @Column(name="RESUME_REVD")
	  private String RESUME_REVD  ;
	  
	  @Column(name="RESUME_UPLOAD")
	  private String RESUME_UPLOAD;
	  
	  @Column(name="START_DATE")
	  private Date START_DATE ; 
	  
	  @Column(name="END_DATE")
	  private Date END_DATE ;
	  
	  @Column(name="MAKER_ID")
	  private int MAKER_ID  ;
	  
	  @Column(name="STATUS")
	  private String STATUS ;
	  
	  //Getters & Setters
	public int getONBOARD_ID() {
		return ONBOARD_ID;
	}
	public void setONBOARD_ID(int oNBOARD_ID) {
		ONBOARD_ID = oNBOARD_ID;
	}
	public String getPR_NO() {
		return PR_NO;
	}
	public void setPR_NO(String pR_NO) {
		PR_NO = pR_NO;
	}
	public String getOPP_ID() {
		return OPP_ID;
	}
	public void setOPP_ID(String oPP_ID) {
		OPP_ID = oPP_ID;
	}
	public String getLATERAL_HIRE() {
		return LATERAL_HIRE;
	}
	public void setLATERAL_HIRE(String lATERAL_HIRE) {
		LATERAL_HIRE = lATERAL_HIRE;
	}
	public String getTRANSFER_INIT() {
		return TRANSFER_INIT;
	}
	public void setTRANSFER_INIT(String tRANSFER_INIT) {
		TRANSFER_INIT = tRANSFER_INIT;
	}
	public String getBUSS_UNIT() {
		return BUSS_UNIT;
	}
	public void setBUSS_UNIT(String bUSS_UNIT) {
		BUSS_UNIT = bUSS_UNIT;
	}
	public String getCADRE() {
		return CADRE;
	}
	public void setCADRE(String cADRE) {
		CADRE = cADRE;
	}
	
	public String getDEPT() {
		return DEPT;
	}
	public void setDEPT(String dEPT) {
		DEPT = dEPT;
	}
	public String getBUSS_AREA() {
		return BUSS_AREA;
	}
	public void setBUSS_AREA(String bUSS_AREA) {
		BUSS_AREA = bUSS_AREA;
	}
	public String getBUSS_AREA_GRP() {
		return BUSS_AREA_GRP;
	}
	public void setBUSS_AREA_GRP(String bUSS_AREA_GRP) {
		BUSS_AREA_GRP = bUSS_AREA_GRP;
	}
	public String getSITE() {
		return SITE;
	}
	public void setSITE(String sITE) {
		SITE = sITE;
	}
	public String getWORK_LOC_COUNTRY() {
		return WORK_LOC_COUNTRY;
	}
	public void setWORK_LOC_COUNTRY(String wORK_LOC_COUNTRY) {
		WORK_LOC_COUNTRY = wORK_LOC_COUNTRY;
	}
	public String getWORK_LOC_CITY() {
		return WORK_LOC_CITY;
	}
	public void setWORK_LOC_CITY(String wORK_LOC_CITY) {
		WORK_LOC_CITY = wORK_LOC_CITY;
	}
	public String getPRJ_COA_CONTRY() {
		return PRJ_COA_CONTRY;
	}
	public void setPRJ_COA_CONTRY(String pRJ_COA_CONTRY) {
		PRJ_COA_CONTRY = pRJ_COA_CONTRY;
	}
	public String getRM_PROFILE_REVD() {
		return RM_PROFILE_REVD;
	}
	public void setRM_PROFILE_REVD(String rM_PROFILE_REVD) {
		RM_PROFILE_REVD = rM_PROFILE_REVD;
	}
	public String getCLIENT_PROFILE_SHRD() {
		return CLIENT_PROFILE_SHRD;
	}
	public void setCLIENT_PROFILE_SHRD(String cLIENT_PROFILE_SHRD) {
		CLIENT_PROFILE_SHRD = cLIENT_PROFILE_SHRD;
	}
	public Date getCLIENT_INT_DATE() {
		return CLIENT_INT_DATE;
	}
	public void setCLIENT_INT_DATE(Date cLIENT_INT_DATE) {
		CLIENT_INT_DATE = cLIENT_INT_DATE;
	}
	public Date getCONF_DATE() {
		return CONF_DATE;
	}
	public void setCONF_DATE(Date cONF_DATE) {
		CONF_DATE = cONF_DATE;
	}
	public String getBILLED_STATUS() {
		return BILLED_STATUS;
	}
	public void setBILLED_STATUS(String bILLED_STATUS) {
		BILLED_STATUS = bILLED_STATUS;
	}
	public Date getBILL_START_DATE() {
		return BILL_START_DATE;
	}
	public void setBILL_START_DATE(Date bILL_START_DATE) {
		BILL_START_DATE = bILL_START_DATE;
	}
	public Date getBILL_END_DATE() {
		return BILL_END_DATE;
	}
	public void setBILL_END_DATE(Date bILL_END_DATE) {
		BILL_END_DATE = bILL_END_DATE;
	}
	public String getNIID_APP_ID() {
		return NIID_APP_ID;
	}
	public void setNIID_APP_ID(String nIID_APP_ID) {
		NIID_APP_ID = nIID_APP_ID;
	}
	public String getG_LOGON_ID() {
		return G_LOGON_ID;
	}
	public void setG_LOGON_ID(String g_LOGON_ID) {
		G_LOGON_ID = g_LOGON_ID;
	}
	public String getNOR_MGR() {
		return NOR_MGR;
	}
	public void setNOR_MGR(String nOR_MGR) {
		NOR_MGR = nOR_MGR;
	}
	public String getNOR_COA() {
		return NOR_COA;
	}
	public void setNOR_COA(String nOR_COA) {
		NOR_COA = nOR_COA;
	}
	public String getADD_REPLACE() {
		return ADD_REPLACE;
	}
	public void setADD_REPLACE(String aDD_REPLACE) {
		ADD_REPLACE = aDD_REPLACE;
	}
	public String getREP_NAME() {
		return REP_NAME;
	}
	public void setREP_NAME(String rEP_NAME) {
		REP_NAME = rEP_NAME;
	}
	public Date getREP_ASS_LST_DATE() {
		return REP_ASS_LST_DATE;
	}
	public void setREP_ASS_LST_DATE(Date rEP_ASS_LST_DATE) {
		REP_ASS_LST_DATE = rEP_ASS_LST_DATE;
	}
	public String getPM_NAME() {
		return PM_NAME;
	}
	public void setPM_NAME(String pM_NAME) {
		PM_NAME = pM_NAME;
	}
	public String getDM_NAME() {
		return DM_NAME;
	}
	public void setDM_NAME(String dM_NAME) {
		DM_NAME = dM_NAME;
	}
	public Date getLTI_JOIN_DATE() {
		return LTI_JOIN_DATE;
	}
	public void setLTI_JOIN_DATE(Date lTI_JOIN_DATE) {
		LTI_JOIN_DATE = lTI_JOIN_DATE;
	}
	public Date getNOR_JOIN_DATE() {
		return NOR_JOIN_DATE;
	}
	public void setNOR_JOIN_DATE(Date nOR_JOIN_DATE) {
		NOR_JOIN_DATE = nOR_JOIN_DATE;
	}
	public String getNDA_RCVD() {
		return NDA_RCVD;
	}
	public void setNDA_RCVD(String nDA_RCVD) {
		NDA_RCVD = nDA_RCVD;
	}
	public String getNDA_UPLOAD() {
		return NDA_UPLOAD;
	}
	public void setNDA_UPLOAD(String nDA_UPLOAD) {
		NDA_UPLOAD = nDA_UPLOAD;
	}
	public String getRESUME_REVD() {
		return RESUME_REVD;
	}
	public void setRESUME_REVD(String rESUME_REVD) {
		RESUME_REVD = rESUME_REVD;
	}
	public String getRESUME_UPLOAD() {
		return RESUME_UPLOAD;
	}
	public void setRESUME_UPLOAD(String rESUME_UPLOAD) {
		RESUME_UPLOAD = rESUME_UPLOAD;
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
		return "nor_onboarding_details [ONBOARD_ID=" + ONBOARD_ID +", PR_NO=" + PR_NO
				+ ", OPP_ID=" + OPP_ID + ", LATERAL_HIRE=" + LATERAL_HIRE + ", TRANSFER_INIT=" + TRANSFER_INIT
				+ ", BUSS_UNIT=" + BUSS_UNIT + ", CADRE=" + CADRE +", DEPT=" + DEPT
				+ ", BUSS_AREA=" + BUSS_AREA + ", BUSS_AREA_GRP=" + BUSS_AREA_GRP + ", SITE=" + SITE
				+ ", WORK_LOC_COUNTRY=" + WORK_LOC_COUNTRY + ", WORK_LOC_CITY=" + WORK_LOC_CITY + ", PRJ_COA_CONTRY="
				+ PRJ_COA_CONTRY + ", RM_PROFILE_REVD=" + RM_PROFILE_REVD + ", CLIENT_PROFILE_SHRD="
				+ CLIENT_PROFILE_SHRD + ", CLIENT_INT_DATE=" + CLIENT_INT_DATE + ", CONF_DATE=" + CONF_DATE
				+ ", BILLED_STATUS=" + BILLED_STATUS + ", BILL_START_DATE=" + BILL_START_DATE + ", BILL_END_DATE="
				+ BILL_END_DATE + ", NIID_APP_ID=" + NIID_APP_ID + ", G_LOGON_ID=" + G_LOGON_ID + ", NOR_MGR=" + NOR_MGR
				+ ", NOR_COA=" + NOR_COA + ", ADD_REPLACE=" + ADD_REPLACE + ", REP_NAME=" + REP_NAME
				+ ", REP_ASS_LST_DATE=" + REP_ASS_LST_DATE + ", PM_NAME=" + PM_NAME + ", DM_NAME=" + DM_NAME
				+ ", LTI_JOIN_DATE=" + LTI_JOIN_DATE + ", NOR_JOIN_DATE=" + NOR_JOIN_DATE + ", NDA_RCVD=" + NDA_RCVD
				+ ", NDA_UPLOAD=" + NDA_UPLOAD + ", RESUME_REVD=" + RESUME_REVD + ", RESUME_UPLOAD=" + RESUME_UPLOAD
				+ ", START_DATE=" + START_DATE + ", END_DATE=" + END_DATE + ", MAKER_ID=" + MAKER_ID + ", STATUS="
				+ STATUS + "]";
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
	
	@OneToOne(cascade=CascadeType.DETACH)
	@JoinColumn(name="PROJECT_ID")
	private Nor_project_details nor_project_details;

	public Nor_project_details getNor_project_details() {
		return nor_project_details;
	}
	public void setNor_project_details(Nor_project_details nor_project_details) {
		this.nor_project_details = nor_project_details;
	}
	  
	  

}
