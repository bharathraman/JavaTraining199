package com.java.Student_project;

import java.util.List;
import java.util.Scanner;

public class StudentMain {
	static Scanner sc=new Scanner(System.in);
	
	public static void addStudent() throws StudentException {
		Student st = new Student();
		System.out.println("Enter Student SRN");
		st.setSRN(sc.nextInt());
		System.out.println("Enter Student Name :");
		st.setname(sc.next());
		System.out.println("Enter the City :");
		st.setcity(sc.next());
		System.out.println("Enter Student CGPA :");
		st.setcgpa(sc.nextDouble());
		
		StudentBAL bal= new StudentBAL();
		System.out.println(bal.addStudentBal(st));
	}
	
	
	public static void showStudent() {
		List<Student> studentList = new StudentDAO().showStudentDao();
		for (Student student : studentList) {
			System.out.println(student);
		}
	}
	
	
	public static void searchStudent() {
		System.out.println("Enter Student SRN :");
		int SRN =sc.nextInt();
		StudentBAL bal = new StudentBAL();
		Student student = bal.searchStudentBal(SRN);
		if(student!=null) {
			System.out.println(student);
		}else {
			System.out.println("****Records not found****");
		}
		
	}
	
	
	public static void deleteStudent() {
		System.out.println("Enter Student SRN    ");
		int SRN = sc.nextInt();
		StudentBAL bal = new StudentBAL();
		System.out.println(bal.deleteStudentBal(SRN));
		
	}
	public static void updateStudent() throws StudentException {
		Student st = new Student();
		System.out.println("Enter Student SRN");
		st.setSRN(sc.nextInt());
		System.out.println("Enter Student Name :");
		st.setname(sc.next());
		System.out.println("Enter the City :");
		st.setcity(sc.next());
		System.out.println("Enter Student CGPA :");
		st.setcgpa(sc.nextDouble());
		
		StudentBAL bal= new StudentBAL();
		System.out.println(bal.updateStudentBal(st));
	}
	
public static void main(String[] args) throws StudentException {
	int choice =0;
	do {
	System.out.println("O\tP\tT\tI\tO\tN\tS\n");
	System.out.println("1. Add Student ");
	System.out.println("2. Show students");
	System.out.println("3. Delete Student");
	System.out.println("4. Update Student");
	System.out.println("5.Exit");
	choice= sc.nextInt();
	
	switch (choice) {
	case 1:
		try {
			addStudent();
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		break;
	case 2: 
		showStudent();
		break;
	case 3:
		deleteStudent();
		break;
	case 4:
		updateStudent();
		break;
	case 5:
		return;
	}
		
	}while(choice <= 5);
}



}
