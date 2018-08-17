package com.werum.hibtst;

public class Department {
	
	private String departmentName;
	private String departmentNo;
	private Department[] subDepartments;
	
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentNo() {
		return departmentNo;
	}
	public void setDepartmentNo(String departmentNo) {
		this.departmentNo = departmentNo;
	}
	public Department[] getSubDepartments() {
		return subDepartments;
	}
	public void setSubDepartments(Department[] subDepartments) {
		this.subDepartments = subDepartments;
	}
}
