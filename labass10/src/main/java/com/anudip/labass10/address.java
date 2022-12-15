package com.anudip.labass10;

import javax.persistence.Embeddable;

@Embeddable
public class address {
	private String hname,area,city;
	private int pincode;
	public address() {
		
		// TODO Auto-generated constructor stub
	}
	public address(String hname, String area, String city, int pincode) {
		super();
		this.hname = hname;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
}
