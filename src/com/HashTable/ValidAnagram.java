package com.HashTable;

import java.util.HashMap;
//FaceBook Asked
//Given two strings s and t , write a function to determine if t is an anagram of s.
//Sum no 242
public class ValidAnagram {
	public static boolean isAnagram(String s ,String f) {
		int s1= s.length();
		int s2=f.length();
		if(s1!= s2) { return false;}
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<s1;i++) {
		   map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		   map.put(f.charAt(i),map.getOrDefault(f.charAt(i), 0)-1 );
		}
		for(char c: map.keySet()) {
			if(map.get(c)!=0) {return false;}
		}
		return true;
	}

	public static void main(String[] args) {
		String s= "anagram";
		String t="nagaram";
		System.out.print(isAnagram(s,t));
		
		
	}
}
