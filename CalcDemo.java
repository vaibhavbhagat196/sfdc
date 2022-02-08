package com.capgemini.sfdc;

public class CalcDemo {

	public static void Num() {
		System.out.println("10");
	}
	
	public static void Sum(int a,int b) {
		System.out.println("sum of the two integer is "+ a+b);
		
	}
	public static int Num1() {
		return 10;
	}
	public static int sum1(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Num();
		Sum(10,20);
		int result=Num1();
		int result1=sum1(10,30);
		System.out.println(result);
		System.out.println(result1);
				}
}
