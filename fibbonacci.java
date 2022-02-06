package com.capgemini.sfdc;
import java.util.Scanner;
public class fibbonacci {
	public static void main(String[] args) 
	{  
		int a=0,b=1;
		int c=0;
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start value");
		int num=sc.nextInt();
		System.out.println(a);
		System.out.println(b);
		while(num>=1)//5>=1  4>=1; 3>=1
		{
			c=a+b;//c=1; 2; 3; 
			System.out.println(c);//1 2 4
			a=b;//1
			b=c;//1 2 3
			num--;//5-----4----3
			
		}


	}

}
