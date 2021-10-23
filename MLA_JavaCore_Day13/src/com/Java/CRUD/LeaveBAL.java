package com.Java.CRUD;
import java.util.*;

public class LeaveBAL {
	static StringBuilder sb = new StringBuilder();

	public String applyLeaveBal(Leave l) throws LeaveException {
		
		LeaveDAO dao = new LeaveDAO();
		if(validateLeave(l)==true) {
			return dao.applyLeaveDao(l);
		}
		else {
			throw new LeaveException(sb.toString());
		}

	}
	
	public List<Leave> showStudentBal(){
		return new LeaveDAO().showLeaveDao();
	}

	private boolean validateLeave(Leave l) {
		boolean isAdded=true;
		if(l.getLeaveid()<=0) {
			isAdded=false;
			sb.append("Leave ID cannot be Zero\n");
			
		}
		if(l.getreason().length()<=5) {
			isAdded=false;
			sb.append("Need reason in more described \n");
		}
		
		return isAdded;
	}

	public String updateLeaveBal(Leave l) throws LeaveException {
		LeaveDAO dao= new LeaveDAO();
		if(validateLeave(l)==true) {
			return dao.updateLeaveDao(l);
			
		}else {
			throw new LeaveException(sb.toString());
		}
	}

	public String deleteLeaveBal(int Leaveid) {
		return new LeaveDAO().deleteLeaveDao(Leaveid);
		
	}

	public Leave searchLeaveBal(int Leaveid) {
		return new LeaveDAO().searchLeaveDao(Leaveid);
		
	}

}
