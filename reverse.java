package com.capgemini.sfdc;
import java.util.Scanner;
public class reverse {
	public static void main(String[] args) 
	{ int rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		while(num>0)//1234>0 true
		{
			int digit=num%10;//1234%10=4//123%10=3
			rev=(rev*10)+digit;//432*10+1=4321
			num=num/10;
		}
		System.out.println(rev);

	}


}
