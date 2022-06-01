package com.ganesh.main.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	private @Id @GeneratedValue Long Id;
	private String emId;
    private String name;
    private String email;
    private String address;
    private String department;
    private Long contactNo;
    private String joiningDate;
	public Employee() {
		super();
	}
	public Employee(Long id, String emId, String name, String email, String address, String department, Long contactNo,
			String joiningDate) {
		super();
		Id = id;
		this.emId = emId;
		this.name = name;
		this.email = email;
		this.address = address;
		this.department = department;
		this.contactNo = contactNo;
		this.joiningDate = joiningDate;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getEmId() {
		return emId;
	}
	public void setEmId(String emId) {
		this.emId = emId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Long getContactNo() {
		return contactNo;
	}
	public void setContactNo(Long contactNo) {
		this.contactNo = contactNo;
	}
	public String getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", emId=" + emId + ", name=" + name + ", email=" + email + ", address=" + address
				+ ", department=" + department + ", contactNo=" + contactNo + ", joiningDate=" + joiningDate + "]";
	}
	
	
}
