package com.practice.decision;

public class Nestedifelse {
	
	public static void main(String[] args) {
		
		int age=20;
		int weight=48;
		
		if(age>=18)
		{
			if(weight>=50) {
				System.out.println("Your eligible to donated blood");
			}
			else {
				System.out.println("not eligible ");
			}
		}
			else {
				System.out.println("age must greter than 18");
			}
		
			

	}

}
