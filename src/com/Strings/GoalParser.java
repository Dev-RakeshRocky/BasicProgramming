package com.Strings;
/*Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".

Input: command = "G()()()()(al)"
Output: "Gooooal"
	
Input: command = "(al)G(al)()()G"
Output: "alGalooG"*/
public class GoalParser {
	private static String interpret(String s1) {
		StringBuilder S = new StringBuilder(s1.length());
		for(int i = 0 ; i < s1.length() ; i++){
			if(s1.charAt(i)=='G') S.append('G');
			if(s1.charAt(i)=='('){
				if(s1.charAt(i+1)==')') {S.append('o'); i++;}
				else{S.append("al"); i = i + 3;}
			}
		}
		return S.toString();

	    }		
	public static void main(String[] args) {
		String s1="(al)G(al)()()G";
		System.out.println(interpret(s1));
	}
}
