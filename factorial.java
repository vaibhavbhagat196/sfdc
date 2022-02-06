package com.capgemini.sfdc;
import java.util.Scanner;

public class factorial {
	public static void main(String[] args) 
	{ 
		int fact=1;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the start value");
		int start=sc.nextInt();
		while(start>=1)
		{
			fact=fact*start;
			start--;
		}
        System.out.println(fact);
	

	}

}
