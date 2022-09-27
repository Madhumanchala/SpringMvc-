package com.programs;

public class swapbitwise {

	public static void main(String[] args) {

		int a = 2, b = 4;

		System.out.println("Before swapping a=" + a + ",b=" + b);

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("after  swapping a=" + a + ",b=" + b);
	}

}
