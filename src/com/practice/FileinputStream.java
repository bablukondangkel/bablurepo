package com.practice;
import java.io.*;

public class FileStream {

	public static void main(String[] args) {
		 FileInputStream ar=new  FileInputStream("C:\\MyData\\employeedetails.txt");
		
		int i;
			while((i=ar.read()) !=-1);
			System.out.print((char)i);
			
		}
	}

}
