package com.Arrays;

/*
   Given an integer array nums, find the contiguous subarray (containing at least one number)
   which has the largest sum and return its sum.
   Follow up: If you have figured out the O(n) solution, 
   try coding another solution using the divide and conquer approach, which is more subtle.
    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6.
*/
public class MaximumSubArray {
	private static Integer maxSubArray(Integer[] nums) {
		Integer result = 0;
		int[] sum = new int[nums.length];
		sum[0] =nums[0];
		for(int i=1;i<nums.length;i++)
		{
		sum[i]=Math.max(nums[i], sum[i-1]+nums[i]);
		result = Math.max(result,sum[i]);
		}
		return result;
	}
	public static void main(String[] args) {
		Integer[] in = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(in));
	}
}
