package com.HashTable;

import java.util.HashMap;
import java.util.Map;
//1512 Good pairs
//Problem stmt
/*Given an array of integers nums.
A pair (i,j) is called good if nums[i] == nums[j] and i < j.
Return the number of good pair*/
public class NumberOfGoodPairs {
	public static int goodPair(int[] nu) {
		int count =0;
		Map<Integer,Integer> map = new HashMap<>();
		for(int n:nu) {
			map.put(n, map.getOrDefault(n, 0)+1);
			count+=map.get(n)-1;
		}
		return count;
	}
	public static void main(String[] args) {
    int[] nums = {1,2,3,1,1,3};
    System.out.println("Answer is "+goodPair(nums));
	}

}
