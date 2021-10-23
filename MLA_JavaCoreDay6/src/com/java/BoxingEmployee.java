package com.java;

public class BoxingEmployee {
public void show(Object ob) {
	System.out.println(ob.getClass().getSimpleName());
	String type= ob.getClass().getSimpleName();
	if(type.equals("Employee")) {
		Employee x =(Employee)ob;
		System.out.println("Employee Number "+x.empno);
		System.out.println("Employee Name "+x.name);
		System.out.println("Employee Basic Salary "+x.basicsal);
	}
	if(type.equals("Student")) {
		Student st = (Student)ob;
	System.out.println("Student SRN "+st.SRN);
	System.out.println("Student Name "+st.Name);
	System.out.println("Student CGPA "+st.cgpa);
	}
	
}
public static void main(String[] args) {
	Employee emp = new Employee();
	emp.empno=07;
	emp.name="Bharath";
	emp.basicsal=80844;
	
	Student stu = new Student();
	stu.SRN=1234;
	stu.Name="Bharath";
	stu.cgpa=7.8;
	BoxingEmployee obj = new BoxingEmployee();
	obj.show(emp);
	obj.show(stu);
}
}

