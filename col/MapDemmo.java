package com.capgemini.sfdc.col;

import java.util.HashMap;
import java.util.Map;

public class MapDemmo {
 public static void main(String[] args) {
	Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
	m1.put(10,100);
	m1.put(11,677);
	m1.put(12, 110);
	System.out.println(m1);
	System.out.println(m1.size());
	m1.remove(11);
	System.out.println(m1);
	System.out.println(m1.keySet());
	System.out.println(m1.values());
	System.out.println(m1.get(11));
	String str="5:30";
	System.out.println(str.split(":"));
	
}
}
