package com.capgemini.sfdc;
import java.util.Scanner;
public class input {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter your lucky number ");
		
		int name=sc.nextInt();
		
		System.out.println("enter your date of birth");
		
		int date=sc.nextInt();
		
		System.out.println("your name is "+name + " and date birth is "+date);
		

	}

}
