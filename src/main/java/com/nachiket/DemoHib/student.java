package com.nachiket.DemoHib;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student {
	@Id
	private int sid ;
	private StudentName sname ;
	private String sSchool;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}

	public StudentName getSname() {
		return sname;
	}
	public void setSname(StudentName sname) {
		this.sname = sname;
	}
	public String getsSchool() {
		return sSchool;
	}
	public void setsSchool(String sSchool) {
		this.sSchool = sSchool;
	}
	@Override
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + ", sSchool=" + sSchool + "]";
	}
	
	
}
