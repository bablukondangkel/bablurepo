package com.practice;

public class PackageAdd{
	public static void main(String[] args) {
		PackageAdd obj=new PackageAdd();
		obj.saisuman("");
		System.out.println("name");
		obj.display("");
		System.out.println("title");
	}
	
	public void saisuman(String bablu){
		String a="bablu";
		display(a);	
	}
	
    protected void display(String kondangkel) {
    	String b="kondangkel";
		display(b);
		
	}
    
}
