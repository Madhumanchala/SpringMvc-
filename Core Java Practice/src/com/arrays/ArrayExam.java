package com.arrays;

public class ArrayExam {
	
	public static void main(String[] args) {
	
		int arrays[]= {10,20,30,40,50};
		int array[]=new int[10];
		array[0]=2;
		array[1]=3;
		array[2]=4;
		array[3]=10;
		array[4]=12;
		arrays[1]=100;
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(arrays[1]);
		
		
		
		System.out.println();
		System.out.println("Length of array is "+array.length);
		

		
		for(int i=0;i<arrays.length;i++)
		{
			System.out.println(arrays[i]+"  ");
		}




		
	}
	

}
