package com.ganesh.main.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class LeaveManage {
    @Id @GeneratedValue
	private Long id;
    private String empId;
    private String ename;
    private String edepartment;
    private String reportTo;
    private String approver;
    private String startDate;
    private String endDate;
    private Long noOfDays;
    private String approvalDate;
    private String status;
	public LeaveManage() {
		super();
	}
	public LeaveManage(Long id, String empId, String ename, String edepartment, String reportTo, String approver,
			String startDate, String endDate, Long noOfDays, String approvalDate, String status) {
		super();
		this.id = id;
		this.empId = empId;
		this.ename = ename;
		this.edepartment = edepartment;
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
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdepartment() {
		return edepartment;
	}
	public void setEdepartment(String edepartment) {
		this.edepartment = edepartment;
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
		return "LeaveManage [id=" + id + ", empId=" + empId + ", ename=" + ename + ", edepartment=" + edepartment
				+ ", reportTo=" + reportTo + ", approver=" + approver + ", startDate=" + startDate + ", endDate="
				+ endDate + ", noOfDays=" + noOfDays + ", approvalDate=" + approvalDate + ", status=" + status + "]";
	}
	
}
