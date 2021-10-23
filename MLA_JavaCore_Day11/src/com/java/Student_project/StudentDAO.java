package com.java.Student_project;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
static List<Student> studentList;
static {
	studentList= new ArrayList<Student>();
}

public Student searchStudentDao(int SRN) {
	Student student =null;
	for(Student s: studentList) {
		if(s.getSRN()==SRN) {
			student=s;
		}
	}
	return student;

}

public String addStudentDao(Student student) {
	studentList.add(student);
	return "Student Record Inserted Successfully..";
	
}
public List<Student> showStudentDao(){
	return studentList;
}

public String updateStudetDao(Student studentNew) {
	Student old = searchStudentDao(studentNew.getSRN());
	if(old!=null) {
		old.setSRN(studentNew.getSRN());
		old.setname(studentNew.getname());
		old.setcity(studentNew.getcity());
		old.setcgpa(studentNew.getcgpa());
		return "Student Record updated..";
	}
	return "Student record not found..";
}

public String deleteStudentDao(int SRN) {
	Student student =searchStudentDao(SRN);
	if(student!=null) {
		studentList.remove(student);
		return "Student record Deleted successfully";
	}
	else {
		return "Student record not found";
	}
	
}

}
