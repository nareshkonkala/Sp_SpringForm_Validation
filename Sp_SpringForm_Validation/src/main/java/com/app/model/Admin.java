package com.app.model;

import java.util.List;

public class Admin {
	private String adminName;
	private String dept;
	private String grade;
	private String note;
	private List<String> grant ;
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public List<String> getGrant() {
		return grant;
	}
	public void setGrant(List<String> grant) {
		this.grant = grant;
	}
	@Override
	public String toString() {
		return "Admin [adminName=" + adminName + ", dept=" + dept + ", grade=" + grade + ", note=" + note + ", grant="
				+ grant + "]";
	}
	
	


}
