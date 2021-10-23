package com.java.Student_project;

import java.util.List;

public class StudentBAL {
	static StringBuilder sb = new StringBuilder();
	public Student searchStudentBal(int SRN) {
		return new StudentDAO().searchStudentDao(SRN);
	}
	
	public String addStudentBal(Student student)throws StudentException{
		StudentDAO dao = new StudentDAO();
		if(validateStudent(student)==true) {
			return dao.addStudentDao(student);
		}
		else {
			throw new StudentException(sb.toString());
		}
	}
	
	public List<Student> showStudentBal(){
		return new StudentDAO().showStudentDao();
	}

	private boolean validateStudent(Student student) {
		boolean isAdded=true;
		if(student.getSRN()<=0) {
			isAdded=false;
			sb.append("Student SRN cannot be Zero\n");
			
		}
		if(student.getname().length()<=2) {
			isAdded=false;
			sb.append("Name cannot be less than 2 words \n");
		}
		if(student.getcity().length()<=3) {
			isAdded=false;
			sb.append("City name cannot be less than 3 words");
		}
		if(student.getcgpa()<=0) {
			isAdded=false;
			sb.append("CGPA cannot be zero or Negative");
		}
		return isAdded;
	}

	public String updateStudentBal(Student st) throws StudentException {
		StudentDAO dao= new StudentDAO();
		if(validateStudent(st)==true) {
			return dao.updateStudetDao(st);
			
		}else {
			throw new StudentException(sb.toString());
		}
	

	}

	public String deleteStudentBal(int SRN) {
		return new StudentDAO().deleteStudentDao(SRN);
		
	}

}
