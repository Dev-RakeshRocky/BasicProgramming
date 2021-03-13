package com.Strings;
//Prob number 58 Easy
public class LengthOfLastWord {
	private static int calcluateLength(String s) {
		int result =0;
		int n =s.length();
		while(n>0) {
			if(s.charAt(--n)!=' ')
				result++;
			else if(result>0) 
				return result;
		}
	return result;
	}
	public static void main(String[] args) {
       String word = "Hello WORLD";
       System.out.println( calcluateLength(word));    
	}

}
