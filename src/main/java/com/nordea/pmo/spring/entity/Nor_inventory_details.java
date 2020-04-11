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
@Table(name="Nor_inventory_details")
public class Nor_inventory_details {

	@Id	
	@Column(name="INV_ID")
	private int INV_ID ;
	
	@Column(name="KID")
	private String  KID ;
	
	@Column(name="SEAT_NO")
	private String  SEAT_NO ;
	
	@Column(name="MONITOR_IV_NO_1")
	private String   MONITOR_IV_NO_1 ;
	
	@Column(name="MONITOR_SERIAL_NO_1")
	private String   MONITOR_SERIAL_NO_1;
	
	@Column(name="MONITOR_IV_NO_2")
	private String   MONITOR_IV_NO_2 ;
	
	@Column(name="MONITOR_SERIAL_NO_2")
	private String   MONITOR_SERIAL_NO_2;
	
	@Column(name="CPU_IV_NO")
	private String   CPU_IV_NO  ;
	
	@Column(name="CPU_SERIAL_NO")
	private String   CPU_SERIAL_NO;
	
	@Column(name="HEADPHONE")
	private String   HEADPHONE ;
	
	@Column(name="DRAWER_KEY")
	private String   DRAWER_KEY ;
	
	@Column(name="START_DATE")
	private Date   START_DATE ;
	
	@Column(name="END_DATE")
	private Date   END_DATE ;
	
	@Column(name="MAKER_ID")
	private int  MAKER_ID ;
	
	@Column(name="STATUS")
	private String   STATUS;
	
	
	public int getINV_ID() {
		return INV_ID;
	}
	public void setINV_ID(int iNV_ID) {
		INV_ID = iNV_ID;
	}
	public String getKID() {
		return KID;
	}
	public void setKID(String kID) {
		KID = kID;
	}
	public String getSEAT_NO() {
		return SEAT_NO;
	}
	public void setSEAT_NO(String sEAT_NO) {
		SEAT_NO = sEAT_NO;
	}
	public String getMONITOR_IV_NO_1() {
		return MONITOR_IV_NO_1;
	}
	public void setMONITOR_IV_NO_1(String mONITOR_IV_NO_1) {
		MONITOR_IV_NO_1 = mONITOR_IV_NO_1;
	}
	public String getMONITOR_SERIAL_NO_1() {
		return MONITOR_SERIAL_NO_1;
	}
	public void setMONITOR_SERIAL_NO_1(String mONITOR_SERIAL_NO_1) {
		MONITOR_SERIAL_NO_1 = mONITOR_SERIAL_NO_1;
	}
	public String getMONITOR_IV_NO_2() {
		return MONITOR_IV_NO_2;
	}
	public void setMONITOR_IV_NO_2(String mONITOR_IV_NO_2) {
		MONITOR_IV_NO_2 = mONITOR_IV_NO_2;
	}
	public String getMONITOR_SERIAL_NO_2() {
		return MONITOR_SERIAL_NO_2;
	}
	public void setMONITOR_SERIAL_NO_2(String mONITOR_SERIAL_NO_2) {
		MONITOR_SERIAL_NO_2 = mONITOR_SERIAL_NO_2;
	}
	public String getCPU_IV_NO() {
		return CPU_IV_NO;
	}
	public void setCPU_IV_NO(String cPU_IV_NO) {
		CPU_IV_NO = cPU_IV_NO;
	}
	public String getCPU_SERIAL_NO() {
		return CPU_SERIAL_NO;
	}
	public void setCPU_SERIAL_NO(String cPU_SERIAL_NO) {
		CPU_SERIAL_NO = cPU_SERIAL_NO;
	}
	public String getHEADPHONE() {
		return HEADPHONE;
	}
	public void setHEADPHONE(String hEADPHONE) {
		HEADPHONE = hEADPHONE;
	}
	public String getDRAWER_KEY() {
		return DRAWER_KEY;
	}
	public void setDRAWER_KEY(String dRAWER_KEY) {
		DRAWER_KEY = dRAWER_KEY;
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
		return "nor_inventory_details [INV_ID=" + INV_ID + ", KID=" + KID + ", YUBIKEY_NO="
				+  ", SEAT_NO=" + SEAT_NO + ", MONITOR_IV_NO_1=" + MONITOR_IV_NO_1
				+ ", MONITOR_SERIAL_NO_1=" + MONITOR_SERIAL_NO_1 + ", MONITOR_IV_NO_2=" + MONITOR_IV_NO_2
				+ ", MONITOR_SERIAL_NO_2=" + MONITOR_SERIAL_NO_2 + ", CPU_IV_NO=" + CPU_IV_NO + ", CPU_SERIAL_NO="
				+ CPU_SERIAL_NO + ", HEADPHONE=" + HEADPHONE + ", DRAWER_KEY=" + DRAWER_KEY + ", START_DATE="
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

	@OneToOne(cascade=CascadeType.DETACH)
	@JoinColumn(name="YUBIKEY_NO")
	private Nor_yubikey_details nor_yubikey_details;

	public Nor_yubikey_details getNor_yubikey_details() {
		return nor_yubikey_details;
	}
	public void setNor_yubikey_details(Nor_yubikey_details nor_yubikey_details) {
		this.nor_yubikey_details = nor_yubikey_details;
	}
	 
}
