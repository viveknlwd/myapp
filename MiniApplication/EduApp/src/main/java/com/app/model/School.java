package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class School {
	
	@Id
	private int schoolno;
	private String name;
	private String address;
	private String username;
	private String passsword;
	public int getSchoolno() {
		return schoolno;
	}
	public void setSchoolno(int schoolno) {
		this.schoolno = schoolno;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasssword() {
		return passsword;
	}
	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}
	
	
	

}
