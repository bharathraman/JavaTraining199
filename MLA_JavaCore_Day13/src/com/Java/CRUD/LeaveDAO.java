package com.Java.CRUD;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class LeaveDAO {
	
	static List<Leave> Leavelist;
	static {
		Leavelist= new ArrayList<Leave>();
	}
	
	public Leave searchLeaveDao(int Leaveid) {
		Leave leave =null;
		for(Leave ll: Leavelist) {
			if(ll.getLeaveid()==Leaveid) {
				leave=ll;
			}
		}
		return leave;

	}
	
	public String applyLeaveDao(Leave leave) {
		Leavelist.add(leave);
		
		return "Leave Record Inserted Successfully..";
		
	}
	
	public List<Leave> showLeaveDao(){
		return Leavelist;
	}

	public String updateLeaveDao(Leave leaveNew) {
		Leave old = searchLeaveDao(leaveNew.getLeaveid());
		if(old!=null) {
			old.setLeaveid(leaveNew.getLeaveid());
			old.setLeavesd(leaveNew.getLeavesd());
			old.setLeaveed(leaveNew.getLeaveed());
			old.setLeavenum(leaveNew.getLeavenum());
			old.setreason(leaveNew.getreason());
		
			return "Leave Record updated..";
		}
		return "Leave record not found..";
	}

	public String deleteLeaveDao(int Leaveid) {
		Leave leave =searchLeaveDao(Leaveid);
		if(leave!=null) {
			Leavelist.remove(leave);
			return "Leave record Deleted successfully";
		}
		else {
			return "Leave record not found";
		}
		
	}


}
