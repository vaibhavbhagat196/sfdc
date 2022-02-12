package com.capgemini.sfdc.col;

import java.util.Vector;

public class CollectionVector {

	public static void main(String[] args) {
		 Vector<Integer> vector=new Vector<>();
		 System.out.println(vector.size());
		 System.out.println(vector.capacity());// By Default Size of Vector is 10
		 System.out.println(vector);
		 vector.add(10);
		 vector.add(20);
		 vector.add(30);
		 System.out.println(vector.size());
		 System.out.println(vector.capacity());// By Default Size of Vector is 10
		 System.out.println(vector);
		 vector.remove(1);
		 System.out.println(vector);
		 
		 
		 // Same for the Stack Read it from PDF
	}
}
