package com.nordea.pmo.spring.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Pmo_auth_details")
public class Pmo_auth_details {

	
@Id
@Column(name="AUTH_ID")
int	AUTH_ID ;	

@Column(name="USER_ID")
int USER_ID; 	

@Column(name="PASSWORD")
String PASSWORD ;

@Column(name="AUTH_ROLE")
char AUTH_ROLE;

@Column(name="START_DATE")
Date START_DATE;

@Column(name="END_DATE")
Date END_DATE;

public int getAUTH_ID() {
	return AUTH_ID;
}

public void setAUTH_ID(int aUTH_ID) {
	AUTH_ID = aUTH_ID;
}

public int getUSER_ID() {
	return USER_ID;
}

public void setUSER_ID(int uSER_ID) {
	USER_ID = uSER_ID;
}

public String getPASSWORD() {
	return PASSWORD;
}

public void setPASSWORD(String pASSWORD) {
	PASSWORD = pASSWORD;
}

public char getAUTH_ROLE() {
	return AUTH_ROLE;
}

public void setAUTH_ROLE(char aUTH_ROLE) {
	AUTH_ROLE = aUTH_ROLE;
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

@Override
public String toString() {
	return "Pmo_auth_details [AUTH_ID=" + AUTH_ID + ", USER_ID=" + USER_ID + ", PASSWORD=" + PASSWORD + ", AUTH_ROLE="
			+ AUTH_ROLE + ", START_DATE=" + START_DATE + ", END_DATE=" + END_DATE + "]";
}  
	  
	
}
