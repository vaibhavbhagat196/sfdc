package com.capgemini.sfdc.ex;
import java.util.Scanner;

public class ExceptionDemo3 {

	public static void checkEligibility(int age) {
		if (age >= 18) {
			System.out.println("You may vote.");
		} else {
			throw new InvalidVoterException("You can not vote.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age:");

		int age = sc.nextInt();
		try {
			ExceptionDemo3.checkEligibility(age);
		} catch (InvalidVoterException ive) {
			System.out.println(ive.getMessage());
		} 
		finally {
			sc.close();
		}
		
		
	}

}