package com.array;
import java.util.HashMap;

public class InformationofvillageMap {
public static void main(String[] args) {
	
		HashMap<String, String> vr=new HashMap<>();
			vr.put("name", "Bablu");
			vr.put("village", "Basantapur");
			vr.put("District", "Mayurbhanj");
			vr.put("plot no", "234l/23");
			vr.put("Adhar number","7004789959007");
			vr.put("plot area", "60akerin area");
			System.out.println(vr.get("name"));
			System.out.println(vr.get("village"));
			System.out.println(vr.get("District"));
			System.out.println(vr.get("plot no"));
			System.out.println(vr.get("Adhar number"));
			System.out.println("plot area");
	}
}
