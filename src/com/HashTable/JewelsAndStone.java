package com.HashTable;

import java.util.HashSet;
import java.util.Set;
//Problem no: 771
/*You're given strings J representing the types of stones that are jewels, and S representing the stones you have. 
 *  Each character in S is a type of stone you have.  
 *  You want to know how many of the stones you have are also jewels.
   The letters in J are guaranteed distinct, and all characters in J and S are letters.
   Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
*/
public class JewelsAndStone {
	private static int jewelCount(String j,String s) {
		int count=0;
		Set<Character> set= new HashSet<>();
		for(char str:j.toCharArray()) {
			set.add(str);
		}
		for(char stri:s.toCharArray()) {
			if(set.contains(stri)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
            String jewel ="aA";
            String stone="aAAbbb";
           System.out.println( jewelCount(jewel,stone));
	}

}
