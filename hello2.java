package com.capgemini.sfdc;

public class hello2 {

	public static void main(String[] args) {
		
		Attendance(15,25);
		int Rollnumber=15;
		 int date=25;
		 System.out.println("Your are present at 25 jan");
		 
		Rollnumber=27;
		date=22;
		System.out.println("Your are present at 22 jan");
		
	}
	public static void Attendance(int Rollnumber,int date) {
	
		System.out.println("Thank you for coming regularly");
		System.out.println(Rollnumber);
		System.out.println(date);
		
	}
}
