package com.capgemini.sfdc;
//  question n0.c10 sum of number 100 and less than 200 
import java.util.Scanner;
public class sum1 {
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		int sum=0;
		while(num<200)//1234>0 true
		{
			if(num%7==0) {
				sum=sum+num;
			}
			num++;
		}
		System.out.println("sum of the number divisible by 7 is "+sum);

	}


}