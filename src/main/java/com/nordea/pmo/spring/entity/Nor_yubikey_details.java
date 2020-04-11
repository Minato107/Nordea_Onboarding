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
@Table(name="Nor_yubikey_details")
public class Nor_yubikey_details {
		
	@Id	
	@Column(name="YUBIKEY_NO")
	 private int YUBIKEY_NO ;
	
	@Column(name="YUBIKEY_ASSIGN_DATE")
	 private Date  YUBIKEY_ASSIGN_DATE;
	
	@Column(name="YUBIKEY_RELEASE_DATE")
	 private Date  YUBIKEY_RELEASE_DATE;
	
	@Column(name="KID")
	 private String  KID ;
	
	@Column(name="START_DATE")
	 private Date  START_DATE;
	
	@Column(name="END_DATE")
	 private Date  END_DATE ;
	
	@Column(name="MAKER_ID")
	 private int  MAKER_ID ;
	
	@Column(name="STATUS")
	 private String  STATUS ;
	
	//getters and setters
	public int getYUBIKEY_NO() {
		return YUBIKEY_NO;
	}
	public void setYUBIKEY_NO(int yUBIKEY_NO) {
		YUBIKEY_NO = yUBIKEY_NO;
	}
	public Date getYUBIKEY_ASSIGN_DATE() {
		return YUBIKEY_ASSIGN_DATE;
	}
	public void setYUBIKEY_ASSIGN_DATE(Date yUBIKEY_ASSIGN_DATE) {
		YUBIKEY_ASSIGN_DATE = yUBIKEY_ASSIGN_DATE;
	}
	public Date getYUBIKEY_RELEASE_DATE() {
		return YUBIKEY_RELEASE_DATE;
	}
	public void setYUBIKEY_RELEASE_DATE(Date yUBIKEY_RELEASE_DATE) {
		YUBIKEY_RELEASE_DATE = yUBIKEY_RELEASE_DATE;
	}

	public String getKID() {
		return KID;
	}
	public void setKID(String kID) {
		KID = kID;
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
		return "nor_yubikey_details [YUBIKEY_NO=" + YUBIKEY_NO + ", YUBIKEY_ASSIGN_DATE=" + YUBIKEY_ASSIGN_DATE
				+ ", YUBIKEY_RELEASE_DATE=" + YUBIKEY_RELEASE_DATE + ", KID=" + KID
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
	 
	@OneToOne(mappedBy="nor_yubikey_details")
	private Nor_inventory_details nor_inventory_details;
	
	@OneToOne(mappedBy="nor_yubikey_details")
	private Nor_offboarding_details nor_offboarding_details;
	
}
