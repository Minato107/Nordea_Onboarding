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
@Table(name="Nor_emp_details")
public class Nor_emp_details {

	@Id
	@Column(name="PS_NO")
	 private int PS_NO;  
	
	@Column(name="FIRST_NAME")
	 private String  FIRST_NAME;
	
	@Column(name="LAST_NAME")
	 private String LAST_NAME  ;
	
	@Column(name="GENDER")
	 private String GENDER  ;
	
	@Column(name="BASE_LOC")
	 private String BASE_LOC ;
	
	@Column(name="MAIL_ID")
	 private String MAIL_ID  ;
	
	@Column(name="CONTACT_NO")
	 private String CONTACT_NO;
	
	@Column(name="QUAL_1")
	 private String QUAL_1  ;
	
	@Column(name="DATE_OF_PASS_1")
	 private Date DATE_OF_PASS_1;
	
	@Column(name="QUAL_2")
	 private String QUAL_2  ;
	
	@Column(name="DATE_OF_PASS_2")
	 private Date DATE_OF_PASS_2;
	
	@Column(name="QUAL_3")
	 private String QUAL_3  ;
	
	@Column(name="DATE_OF_PASS_3")
	 private Date DATE_OF_PASS_3;
	
	@Column(name="EXPERTIES")
	 private String EXPERTIES ;
	
	@Column(name="DATE_OF_EXP")
	 private int DATE_OF_EXP  ;
	
	@Column(name="EXP_BFR_NOR")
	 private int EXP_BFR_NOR  ;
	
	@Column(name="EXP_BFR_LNT")
	 private int EXP_BFR_LNT ;
	
	@Column(name="DOB")
	 private Date DOB  ;
	
	@Column(name="PAN_NO")
	 private String PAN_NO  ;
	
	@Column(name="PASSPORT_NO")
	 private String PASSPORT_NO  ;
	
	@Column(name="PASSPORT_VAILD_FR")
	private Date PASSPORT_VAILD_FR ;
	
	@Column(name="PASSPORT_VAILD_TO")
	 private Date PASSPORT_VAILD_TO;
	
	
	@Column(name="START_DATE")
	 private Date START_DATE;
	
	@Column(name="END_DATE")
	 private Date END_DATE  ;
	
	@Column(name="MAKER_ID")
	 private int MAKER_ID  ;
	
	@Column(name="STATUS")
	 private String STATUS;
	
	public int getPS_NO() {
		return PS_NO;
	}
	public void setPS_NO(int pS_NO) {
		PS_NO = pS_NO;
	}
	public String getFIRST_NAME() {
		return FIRST_NAME;
	}
	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}
	public String getLAST_NAME() {
		return LAST_NAME;
	}
	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}
	public String getGENDER() {
		return GENDER;
	}
	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}
	public String getBASE_LOC() {
		return BASE_LOC;
	}
	public void setBASE_LOC(String bASE_LOC) {
		BASE_LOC = bASE_LOC;
	}
	public String getMAIL_ID() {
		return MAIL_ID;
	}
	public void setMAIL_ID(String mAIL_ID) {
		MAIL_ID = mAIL_ID;
	}
	public String getCONTACT_NO() {
		return CONTACT_NO;
	}
	public void setCONTACT_NO(String cONTACT_NO) {
		CONTACT_NO = cONTACT_NO;
	}
	public String getQUAL_1() {
		return QUAL_1;
	}
	public void setQUAL_1(String qUAL_1) {
		QUAL_1 = qUAL_1;
	}
	public Date getDATE_OF_PASS_1() {
		return DATE_OF_PASS_1;
	}
	public void setDATE_OF_PASS_1(Date dATE_OF_PASS_1) {
		DATE_OF_PASS_1 = dATE_OF_PASS_1;
	}
	public String getQUAL_2() {
		return QUAL_2;
	}
	public void setQUAL_2(String qUAL_2) {
		QUAL_2 = qUAL_2;
	}
	public Date getDATE_OF_PASS_2() {
		return DATE_OF_PASS_2;
	}
	public void setDATE_OF_PASS_2(Date dATE_OF_PASS_2) {
		DATE_OF_PASS_2 = dATE_OF_PASS_2;
	}
	public String getQUAL_3() {
		return QUAL_3;
	}
	public void setQUAL_3(String qUAL_3) {
		QUAL_3 = qUAL_3;
	}
	public Date getDATE_OF_PASS_3() {
		return DATE_OF_PASS_3;
	}
	public void setDATE_OF_PASS_3(Date dATE_OF_PASS_3) {
		DATE_OF_PASS_3 = dATE_OF_PASS_3;
	}
	public String getEXPERTIES() {
		return EXPERTIES;
	}
	public void setEXPERTIES(String eXPERTIES) {
		EXPERTIES = eXPERTIES;
	}
	public int getDATE_OF_EXP() {
		return DATE_OF_EXP;
	}
	public void setDATE_OF_EXP(int dATE_OF_EXP) {
		DATE_OF_EXP = dATE_OF_EXP;
	}
	public int getEXP_BFR_NOR() {
		return EXP_BFR_NOR;
	}
	public void setEXP_BFR_NOR(int eXP_BFR_NOR) {
		EXP_BFR_NOR = eXP_BFR_NOR;
	}
	public int getEXP_BFR_LNT() {
		return EXP_BFR_LNT;
	}
	public void setEXP_BFR_LNT(int eXP_BFR_LNT) {
		EXP_BFR_LNT = eXP_BFR_LNT;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getPAN_NO() {
		return PAN_NO;
	}
	public void setPAN_NO(String pAN_NO) {
		PAN_NO = pAN_NO;
	}
	public String getPASSPORT_NO() {
		return PASSPORT_NO;
	}
	public void setPASSPORT_NO(String pASSPORT_NO) {
		PASSPORT_NO = pASSPORT_NO;
	}
	public Date getPASSPORT_VAILD_FR() {
		return PASSPORT_VAILD_FR;
	}
	public void setPASSPORT_VAILD_FR(Date pASSPORT_VAILD_FR) {
		PASSPORT_VAILD_FR = pASSPORT_VAILD_FR;
	}
	public Date getPASSPORT_VAILD_TO() {
		return PASSPORT_VAILD_TO;
	}
	public void setPASSPORT_VAILD_TO(Date pASSPORT_VAILD_TO) {
		PASSPORT_VAILD_TO = pASSPORT_VAILD_TO;
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
		return "nor_emp_details [PS_NO=" + PS_NO + ", FIRST_NAME=" + FIRST_NAME + ", LAST_NAME=" + LAST_NAME
				+ ", GENDER=" + GENDER + ", BASE_LOC=" + BASE_LOC + ", MAIL_ID=" + MAIL_ID + ", CONTACT_NO="
				+ CONTACT_NO + ", QUAL_1=" + QUAL_1 + ", DATE_OF_PASS_1=" + DATE_OF_PASS_1 + ", QUAL_2=" + QUAL_2
				+ ", DATE_OF_PASS_2=" + DATE_OF_PASS_2 + ", QUAL_3=" + QUAL_3 + ", DATE_OF_PASS_3=" + DATE_OF_PASS_3
				+ ", EXPERTIES=" + EXPERTIES + ", DATE_OF_EXP=" + DATE_OF_EXP + ", EXP_BFR_NOR=" + EXP_BFR_NOR
				+ ", EXP_BFR_LNT=" + EXP_BFR_LNT + ", DOB=" + DOB + ", PAN_NO=" + PAN_NO + ", PASSPORT_NO="
				+ PASSPORT_NO + ", PASSPORT_VAILD_FR=" + PASSPORT_VAILD_FR + ", PASSPORT_VAILD_TO=" + PASSPORT_VAILD_TO
				+", START_DATE=" + START_DATE + ", END_DATE=" + END_DATE + ", MAKER_ID="
				+ MAKER_ID + ", STATUS=" + STATUS + "]";
	}  
	  
	@OneToOne(cascade=CascadeType.REMOVE)
	@JoinColumn(name="NOR_ROLE")
	private Nor_rate_details nor_rate_details;

	public Nor_rate_details getNor_rate_details() {
		return nor_rate_details;
	}
	public void setNor_rate_details(Nor_rate_details nor_rate_details) {
		this.nor_rate_details = nor_rate_details;
	}

	@OneToOne(mappedBy="nor_emp_details")
	private Nor_yubikey_details nor_yubikey_details;
	
	@OneToOne(mappedBy="nor_emp_details")
	private Nor_inventory_details nor_inventory_details;
	
	@OneToOne(mappedBy="nor_emp_details")
	private Nor_offboarding_details nor_offboarding_details;
	
	@OneToOne(mappedBy="nor_emp_details")
	private Nor_onboarding_details nor_onboarding_details;
	
	@OneToOne(mappedBy="nor_emp_details")
	private Nor_pmo_details nor_pmo_details;
}
