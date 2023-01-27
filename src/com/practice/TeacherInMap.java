package com.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TeacherInMap {

	public static void main(String[] args) {
		HashMap<String, String> mp=new HashMap<>();
		mp.put("name","Rani");
		mp.put("age", "34");
		mp.put("entrollyno","12345");
		mp.put("Address", "patia");
		mp.put("school", "st xavier english school");
		System.out.println(mp.get("name"));
		System.out.println(mp.get("age"));
		System.out.println(mp.get("entrollyno"));
		System.out.println(mp.get("Address"));
		System.out.println(mp.get("school"));
		
		mp.remove("name");
		System.out.println(mp);
		HashSet<String> set = new HashSet<>();
		
		set.add("Babu");
		set.add("Bablu");
		set.add("Wasim");
		set.add("Babu");
		set.add(null);
		
		System.out.println(set);
		
	}

}
