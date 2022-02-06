package com.capgemini.sfdc;

public class Assignmentone {
	
public static void main(String[]args) {
	
	
	int num=1234;
	 int prod=1;
	 int sum=0;
	while(num>0) {
		int temp=num/10;
		sum=sum+temp;
		prod=prod*num;
		num=num/10;
	}
	System.out.println("sum of the Given number is "+sum);
	System.out.println("product of given number is "+prod);
	
	
	
}
	
}

