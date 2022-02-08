package com.capgemini.sfdc;

  public class BankCustomer {

	static String ifsc;
	int AccountNumber;
	String CustomerName;
	Double balance;
	
	
}


    class Demo {
	
	public static void main(String[] args) {
		BankCustomer.ifsc="BOD0001234";
		System.out.println(BankCustomer.ifsc);
		BankCustomer obj=new BankCustomer();
		obj.AccountNumber=112233422;
		obj.CustomerName="VAIBHAV";
		System.out.println(obj.AccountNumber);
		System.out.println(obj.CustomerName);
	}
}