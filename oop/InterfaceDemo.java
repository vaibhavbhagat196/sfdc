package com.capgemini.sfdc.oop;

//abstract - 
//interface - enables multiple inheritance 

interface SomeInterface {

}

interface StateGovt {

}

interface GovtOfIndia {

	void paySalaries();

}

abstract class BOD {

	abstract void doKyc();

	void payInterest() {

	}
}

class ICICI extends BOD implements GovtOfIndia, StateGovt {

	@Override
	void doKyc() {
		System.out.println("its a Boring thing dont do that");
	}

	void giveLoans() {
		System.out.println("vaibhav");
	}

	void takeDeposits() {
		System.out.println("for that you need money");
	}

	@Override
	public void paySalaries() {
		System.out.println("At the end of month you will get salary ");

	}

}

public class InterfaceDemo {
	public static void main(String[] args) {
		ICICI obj = new ICICI();
		obj.giveLoans();
		obj.takeDeposits();
		obj.doKyc();
		
	}
	
}