package com.capgemini.sfdc;
import java.util.Scanner;

public class sum1 {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
  int sum=0;
	int num=sc.nextInt();
	while(num>100)
	{
		if(num%7==0) {
			sum=sum+num;
			
		}
		else {
			System.out.println("please enter valid number");
		}
	}
	

}
