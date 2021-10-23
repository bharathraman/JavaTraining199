package com.Java.CRUD;

import java.util.Date;

public class Leave {
	
	private int Leaveid;
	private Date Leavesd;
	private Date Leaveed;
	private int Leavenum;
	private String reason;
	private Date Appliedon;
	

	public void setLeaveid(int Leaveid) {
		this.Leaveid= Leaveid;
		
	}
	
	public int getLeaveid() {
		return Leaveid;
	}

	public void setLeavesd(Date Leavesd) {
		this.Leavesd=Leavesd;
		
	}
	
	public Date getLeavesd() {
		return Leavesd;
		
	}

	public void setLeaveed(Date Leaveed) {
		this.Leaveed=Leaveed;
	}
	
	public Date getLeaveed() {
		return Leaveed;
	}

	public void setLeavenum(int days) {
		this.Leavenum=days;
	}
	public int getLeavenum() {
		return Leavenum;
	}

	public void setreason(String reason) {
		this.reason=reason;
	}
	public String getreason() {
		return reason;
	}

	public void setAppliedon(Date date) {
		this.Appliedon=Appliedon;
	}
	public Date  getAppliedon(Date date) {
		return Appliedon;
	}
	
	public Leave() {
		this.Leaveid=Leaveid;
		this.Leavesd=Leavesd;
		this.Leaveed=Leaveed;
		this.reason=reason;
		this.Leavenum=Leavenum;
		this.Appliedon=Appliedon;
	}

	@Override
	public String toString() {
		return "Leave [Leaveid=" + Leaveid + ", Leavesd=" + Leavesd + ", Leaveed=" + Leaveed + ", Leavenum=" + Leavenum
				+ ", reason=" + reason + ", Appliedon=" + Appliedon + "]";
	}
}
