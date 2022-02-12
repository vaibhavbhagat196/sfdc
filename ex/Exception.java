package com.capgemini.sfdc.ex;

import java.util.Scanner;

public class Exception {

	public static void grosaary(int price){
		if(price>100) {
			System.out.println("So many product is  available in 100 rupee");
		}else {
			throw new ProductIsNotAvailable("Can not find the product");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter product price");
		int price=sc.nextInt();
		try {
			Exception.grosaary(price);
		}catch(ProductIsNotAvailable r){
			System.out.println(r.getMessage());
			
		}
	}
}
