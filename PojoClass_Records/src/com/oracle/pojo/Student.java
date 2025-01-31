package com.oracle.pojo;

public class Student { // pojo or entity or DTO
	
	private  int sid;
	private  String sname;
	 private double fee = 5000;
	
	public Student() {
		super();// Object()
	}

	public Student(int sid, String sname, double fee) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.fee = fee;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public int getSid() {
		return sid;
	}

	public String getSname() {
		return sname;
	}

	public double getFee() {
		return fee;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", fee=" + fee + "]";
	}
	


}
