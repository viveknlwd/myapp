package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
	
	@Id
	private int rollNo;
	private String name;
	private String address;
	private String mobileNo;
	private String aadharcardNo;
	private String birthdate;
	private String username;
	private String password;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPancardNo() {
		return aadharcardNo;
	}
	public void setPancardNo(String pancardNo) {
		this.aadharcardNo = pancardNo;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
