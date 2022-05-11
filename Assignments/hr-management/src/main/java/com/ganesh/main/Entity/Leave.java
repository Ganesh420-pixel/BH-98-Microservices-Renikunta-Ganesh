package com.ganesh.main.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Leave {
    @Id
	private Long id;
    private String name;
    private String department;
    private String reportTo;
    private String approver;
    private String startDate;
    private String endDate;
    private Long noOfDays;
    private String approvalDate;
    private String status;
	public Leave() {
		super();
	}
	public Leave(Long id, String name, String department, String reportTo, String approver, String startDate,
			String endDate, Long noOfDays, String approvalDate, String status) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.reportTo = reportTo;
		this.approver = approver;
		this.startDate = startDate;
		this.endDate = endDate;
		this.noOfDays = noOfDays;
		this.approvalDate = approvalDate;
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getReportTo() {
		return reportTo;
	}
	public void setReportTo(String reportTo) {
		this.reportTo = reportTo;
	}
	public String getApprover() {
		return approver;
	}
	public void setApprover(String approver) {
		this.approver = approver;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Long getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(Long noOfDays) {
		this.noOfDays = noOfDays;
	}
	public String getApprovalDate() {
		return approvalDate;
	}
	public void setApprovalDate(String approvalDate) {
		this.approvalDate = approvalDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Leave [id=" + id + ", name=" + name + ", department=" + department + ", reportTo=" + reportTo
				+ ", approver=" + approver + ", startDate=" + startDate + ", endDate=" + endDate + ", noOfDays="
				+ noOfDays + ", approvalDate=" + approvalDate + ", status=" + status + "]";
	}
    
    
}
