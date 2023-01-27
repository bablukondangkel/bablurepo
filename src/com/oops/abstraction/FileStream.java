package com.oops.abstraction;
import java.io.*;

public class FileStream {

	public static void main(String[] args) throws IOException {
			 FileInputStream fr=new  FileInputStream("C:\\MyData\\employeedetails.txt") ;
			 	int i=0;
				while((i=fr.read())!=-1);
				System.out.print((char)i);
		}
}