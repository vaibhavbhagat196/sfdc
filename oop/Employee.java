package com.capgemini.sfdc.oop;

public class Employee {
private int employeeId;
 String firstName;
private double salary;
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}


  public static void main(String[]args) {
	  Employee E1=new Employee();
	  E1.firstName="Vaibhav";
	  System.out.println(E1.firstName);
	  E1.setEmployeeId(1234567);
	  System.out.println(E1.employeeId);
	  
	  
	  
  }
	  
  }
	  
  