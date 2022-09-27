package com.programs;

import java.util.Scanner;

public class Reversenumber {
	
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enert number");
		num=sc.nextInt();
		int reverse=0;
		while(num!=0)
		{
			int remainder=num%10;//rem=123%10=3
			reverse=reverse*10+remainder;
			num=num/10;
			
		}
		System.out.println("reverse number is "+reverse);
		
	}

}
