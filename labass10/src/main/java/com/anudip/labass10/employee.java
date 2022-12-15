package com.anudip.labass10;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employeeinfo")
public class employee {
@Id
private int eid;
private String ename,dept;
private int esalary;
private address address;

public address getAddress() {
	return address;
}
public void setAddress(address address) {
	this.address = address;
}
public employee() {
	
	// TODO Auto-generated constructor stub
}
public employee(int eid, String ename, String dept, int esalary) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.dept = dept;
	this.esalary = esalary;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public int getEsalary() {
	return esalary;
}
public void setEsalary(int esalary) {
	this.esalary = esalary;
}



}
