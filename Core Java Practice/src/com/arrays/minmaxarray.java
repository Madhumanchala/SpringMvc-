package com.arrays;

import java.util.Arrays;

public class minmaxarray {
	
	public static void main(String[] args) {
		
		int[] nums={100,10,10000,200,500};
		Arrays.sort(nums);
		
		System.out.println("Minimum " + nums[0]);
		System.out.println("Maximum " + nums[nums.length-1]);
	}

}
