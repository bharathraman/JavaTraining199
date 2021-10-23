package com.maven.demo;

import java.util.Scanner;
import java.sql.*;
public class EmploySearch {
public static void main(String[] args) {
	int empno;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Employee Number");
	empno=sc.nextInt();
	
	try {
		Employ employ = new EmployDAO().searchEmploy(empno) ;
		if(employ!=null) {
			System.out.println(employ);
			
		}else {
			System.out.println("********Rcords not found********");
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
