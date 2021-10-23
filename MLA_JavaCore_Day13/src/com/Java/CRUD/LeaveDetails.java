package com.Java.CRUD;
import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class LeaveDetails {
	static Scanner sc = new Scanner(System.in);

	public static void applyLeave() throws LeaveException, ParseException {
		
		Leave l = new Leave();
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	        l.setAppliedon(new Date());
		
		System.out.println("Enter Leave ID");
		l.setLeaveid(sc.nextInt());
		
		System.out.println("Enter Leave Start Date (dd-mm-yyyy)");
		try {
            l.setLeavesd(sdf.parse(sc.next()));
        } catch (ParseException e) {
         
            e.printStackTrace();
        }
		System.out.println("Enter Leave End Date");
        try {
            l.setLeaveed(sdf.parse(sc.next()));
        } catch (ParseException e) {

            e.printStackTrace();
        }
    	long ms = l.getLeaveed().getTime() - l.getLeavesd().getTime();
	    long m = ms / (1000 * 24 * 60 * 60);
	    int days = (int) m;
	    days = days + 1;
		System.out.println("Number of days leave applied "+days);
		l.setLeavenum(days);
		System.out.println("Enter reason for leave applied");
		l.setreason(sc.next());
		
		l.setAppliedon(new Date());
		LeaveBAL bal = new LeaveBAL();
		System.out.println( bal.applyLeaveBal(l));
	}
	
	private static void SearchLeave() {
		System.out.println("Enter Leave ID :");
		int Leaveid =sc.nextInt();
		LeaveBAL bal = new LeaveBAL();
		Leave l = bal.searchLeaveBal(Leaveid);
		if(l!=null) {
			System.out.println(l);
		}else {
			System.out.println("****Records not found****");
		}
		
	}

	private static void DeleteLeave() {
		System.out.println("Enter Leave ID   ");
		int Leaveid = sc.nextInt();
		LeaveBAL bal = new LeaveBAL();
		System.out.println(bal.deleteLeaveBal(Leaveid));
		
	}

	private static void UpdateLeave() throws ParseException, LeaveException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	     
		Leave l = new Leave();
		System.out.println("Enter Leave ID");
		l.setLeaveid(sc.nextInt());
		System.out.println("Enter Leave Start Date (dd-mm-yyyy)");
		try {
            l.setLeavesd(sdf.parse(sc.next()));
        } catch (ParseException e) {
         
            e.printStackTrace();
        }
		System.out.println("Enter Leave End Date");
        try {
            l.setLeaveed(sdf.parse(sc.next()));
        } catch (ParseException e) {

            e.printStackTrace();
        }
    	long ms = l.getLeaveed().getTime() - l.getLeavesd().getTime();
	    long m = ms / (1000 * 24 * 60 * 60);
	    int days = (int) m;
	    days = days + 1;
		System.out.println("Number of days leave applied "+days);
//		l.setLeavenum(sc.nextInt());
		System.out.println("Enter reason for leave applied");
		l.setreason(sc.next());
		l.setAppliedon(new Date());
		
	

		
		
		
		LeaveBAL bal= new LeaveBAL();
		System.out.println(bal.updateLeaveBal(l));
		
	}
	

private static void showLeaves() {
	List<Leave> LeaveList = new LeaveDAO().showLeaveDao();
	for (Leave leave : LeaveList) {
		System.out.println(leave);
	}
	
}
	
public static void main(String[] args) throws LeaveException
{
	int choice =0;
	do {
	System.out.println("O P T I O N S\n");
	System.out.println("1. Show all leaves ");
	System.out.println("2. Add Leave");
	System.out.println("3. Update Leave");
	System.out.println("4. Delete Leave ");
	System.out.println("5. Search Leave ");
	System.out.println("6. Exit");
	choice= sc.nextInt();
	
	switch (choice) {
	case 1:
		showLeaves();
		break;
	case 2: 
		try {
			applyLeave();
		} catch (LeaveException | ParseException e) {
			System.out.println(e.getMessage());
		}
		break;
	case 3:
		try {
			UpdateLeave();
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		break;
	case 4:
		DeleteLeave();
		break;
	case 5:
		SearchLeave();
		break;
	case 6: 
		return;
	}
		
	}while(choice <= 6);
}


}
