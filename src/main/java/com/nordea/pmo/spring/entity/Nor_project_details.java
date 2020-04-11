package com.nordea.pmo.spring.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="nor_project_details")
public class Nor_project_details {
	
	
	@Id
	@Column(name="PROJECT_ID")
	 int PROJECT_ID;
	
	@Column(name="PROJECT_TYPE")
	String PROJECT_TYPE;
	
	@Column(name="PROJECT_NAME")
	String PROJECT_NAME;
	
	@Column(name="START_DATE")
	Date START_DATE;
	
	@Column(name="END_DATE")
	Date END_DATE;
	
	@Column(name="MAKER_ID")
	int MAKER_ID ;
	
	@Column(name="STATUS")
	char STATUS;

	public int getPROJECT_ID() {
		return PROJECT_ID;
	}

	public void setPROJECT_ID(int pROJECT_ID) {
		PROJECT_ID = pROJECT_ID;
	}

	public String getPROJECT_TYPE() {
		return PROJECT_TYPE;
	}

	public void setPROJECT_TYPE(String pROJECT_TYPE) {
		PROJECT_TYPE = pROJECT_TYPE;
	}

	public String getPROJECT_NAME() {
		return PROJECT_NAME;
	}

	public void setPROJECT_NAME(String pROJECT_NAME) {
		PROJECT_NAME = pROJECT_NAME;
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

	public char getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(char sTATUS) {
		STATUS = sTATUS;
	}

	@Override
	public String toString() {
		return "Nor_project_details [PROJECT_ID=" + PROJECT_ID + ", PROJECT_TYPE=" + PROJECT_TYPE + ", PROJECT_NAME="
				+ PROJECT_NAME + ", START_DATE=" + START_DATE + ", END_DATE=" + END_DATE + ", MAKER_ID=" + MAKER_ID
				+ ", STATUS=" + STATUS + "]";
	}
	@OneToOne(mappedBy="nor_project_details")
	private Nor_onboarding_details nor_onboarding_details;
}
