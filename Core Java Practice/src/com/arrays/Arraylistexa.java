package com.arrays;

import java.util.ArrayList;

public class Arraylistexa {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Madhu");
		list.add("Ramesh");
		list.add("Kamal");
		
		System.out.println("index of madhu is " + list.indexOf("Madhu"));

		System.out.println(list);
		list.add(1, "Irfan");
		System.out.println(list);
	}

}
