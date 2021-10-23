package com.java.Student_project;

public class Student {
	private int SRN;
	private String name;
	private String city;
	private double cgpa;
	

	public void setSRN(int SRN) {
		// TODO Auto-generated method stub
	 this.SRN=SRN;	
	}
	public int getSRN() {
		// TODO Auto-generated method stub
		return SRN;
	}
	
	public void setname(String name) {
		// TODO Auto-generated method stub
		 this.name=name;
	}
	public String getname() {
		// TODO Auto-generated method stub
		return name;
	}
	public String getcity() {
		// TODO Auto-generated method stub
		return city;
	}
	public void setcity(String city) {
		// TODO Auto-generated method stub
		 this.city=city;
	}
	public double getcgpa() {
		// TODO Auto-generated method stub
		return cgpa;
	}
	public void setcgpa(double cgpa) {
		// TODO Auto-generated method stub
		this.cgpa=cgpa;
	}
	
	public Student() {
		this.SRN=SRN;
		this.name=name;
		this.city=city;
		this.cgpa=cgpa;
	}
	@Override
	public String toString() {
		return "Student [SRN=" + SRN + ", name=" + name + ", city=" + city + ", cgpa=" + cgpa + "]";
	}

	
}
