package com.programs;

public class Randomnumber {

	public static void main(String[] args) {
		generateMyNumber();
	}

	public static void generateMyNumber() {
		int aNumber = 0;
		aNumber = (int) ((Math.random() * 9000) );
		System.out.print("Generated otp is  " + (aNumber));
	}

}
