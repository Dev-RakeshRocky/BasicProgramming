package com.MathAndNumbers;

import java.util.Scanner;
/*Happy number defintion
 * Input: 19
Output: true
Explanation: 
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1*/

public class HappyNumber {
	private  static boolean isHappy(Integer num) {
		//We taking from 6 because before 6 there only one Happy number 1
		  while(num>6) {
              int m =0;
              while(num>0) {
            	  m+=(num%10)*(num%10);
            	  num = num/10;
              }
              System.out.println("Num ="+num);
              System.out.println("M ="+m);
              System.out.println(num = m);
              num = m;
		  }
		  return num==1;
	}
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter number to check wheather happy number or not :");
      Integer num= sc.nextInt();
     System.out.println(isHappy(num));
      
	}
}
