package com.programs;

import java.util.Scanner;

public class comparetwoobjects {
	
	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		System.out.println("enter object ");
		Double a=sc.nextDouble();
		System.out.println("ebter secind");
		Long b=sc.nextLong();
		
		Double c=new Double(a);
		Long d=new Long(b);
		System.out.println("both objects are not equal returns false "+a.equals(b));
		System.out.println("both objects areequal returns true "+a.equals(a));

	}

}
