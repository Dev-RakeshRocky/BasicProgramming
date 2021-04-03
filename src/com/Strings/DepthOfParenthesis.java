package com.Strings;

public class DepthOfParenthesis {
	private static int nestingDeapthOfParanthesis(String s) {
		int depth = 0;
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				depth++;
			else if (s.charAt(i) == ')')
				depth--;
			result = Math.max(result, depth);
		}
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		String str = "(1+(2*3)+((8)/4))+1";
		// 8 is inside 3 nested paranthesis op will be 3
		nestingDeapthOfParanthesis(str);
	}
}
