package com.capgemini.sfdc.col;

import java.util.*;


public class SetDemo {
public static void main(String[] args) {
	Set<Integer> set=new HashSet<>();
	System.out.println(set.size());
	set.add(12);
	set.add(11);
	set.add(13);
	System.out.println(set.size());
	System.out.println(set);
}
}
