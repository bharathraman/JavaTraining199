package com.java.Files;
import java.io.*;

public class FileRead {
public static void main(String[] args) {
	File fr =new File("C:/Users/Bharath/Desktop");
	System.out.println("File Name : "+fr.getName());
	System.out.println("File path:  "+fr.getPath());
	
	try {
		FileReader f1= new FileReader(fr);
		int ch;
		while((ch=f1.read())!=-1) {
			System.out.println((char)ch);
		}
		f1.close();
		
	} catch (FileNotFoundException e) {

		e.printStackTrace();
	} catch(IOException e) {
		e.printStackTrace();
	}
}
}
