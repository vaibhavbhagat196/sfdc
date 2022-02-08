package com.capgemini.sfdc.oop;

//abstract - 

abstract class Rbi {

	abstract void doKyc();

//	void doKyc2() {
//		// code - aadhaar, pan, voter
//	}

}

class HdfcBank extends Rbi {

	@Override
	void doKyc() {
	System.out.println("Need Adharcard ,PanCard,Photo");
	}

	void giveLoans() {
		System.out.println("Need Source of Income");
	}

	void takeDeposits() {
		// code
	}

}

public class AbstractDemo {
	public static void main(String[] args) {
		HdfcBank obj = new HdfcBank();
		obj.giveLoans();
		obj.takeDeposits();
		obj.doKyc();
	}
}