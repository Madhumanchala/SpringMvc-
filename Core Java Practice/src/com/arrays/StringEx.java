package com.arrays;

public class StringEx {
	
	public static void main(String[] args) {
		
		String str="Madhu Madha ";
		String str1=str.concat(" Manchala");
		System.out.println(str);
		System.out.println();
		System.out.println("After Conacatnation "+str1);
		
		System.out.println();
		System.out.println(str.length());
		
		System.out.println(str.replaceAll("a", "A"));
		System.out.println();
	}

}
