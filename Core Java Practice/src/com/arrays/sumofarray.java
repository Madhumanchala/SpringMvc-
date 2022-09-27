package com.arrays;

public class sumofarray {
	
	public static void main(String[] args) {
		
		int arr[]={2,2,3,4,5};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of array is "+sum);
		System.out.println();
		System.out.println("Average of array elements "+sum/2);

	}

}
