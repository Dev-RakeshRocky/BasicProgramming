package com.Strings;

import java.util.HashSet;
import java.util.Set;

//Remove Vowels from String
//Input: "aeiou"
//Output: ""
public class RemovingVowels {

	private static String removeVowels(String input) {
		StringBuilder resultString = new StringBuilder(input.length());
		Set<Character> vowel = new HashSet<Character>();
		vowel.add('a');
		vowel.add('e');
		vowel.add('i');
		vowel.add('o');
		vowel.add('u');
		for(char ch:input.toCharArray()) {
			if(!vowel.contains(ch)) {
				resultString.append(ch);
			}
		}
		return resultString.toString();
	}

	public static void main(String[] args) {
		String input = "ThisisIronBat";
		System.out.println(removeVowels(input));
	}

}
