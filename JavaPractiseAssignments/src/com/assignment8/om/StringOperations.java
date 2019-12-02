package com.assignment8.om;

import java.util.Scanner;

public class StringOperations {
	
	public static String strReversal(String input)
	{
		
		StringBuilder str = new StringBuilder(input);
		str.append(input);
		str.reverse();
		
		return input.toString();
		
	}
	
	public static void checkEquality(String input)
	{
		String str = "Hello! World";
		System.out.println(str.equals(input));
	}
	
	public static boolean checkPalindrome(String input)
	{
		int i=0;int j=input.length()-1;
		while(i<j)
		{
			if(input.charAt(i)!=input.charAt(j))
				return false;
			
			i++;
			j--;
		}
		return true;
	}
	
	
	public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a line or string to perform string manipulation");
	String input = scan.nextLine();
	
	int strLen= input.length();
	System.out.println("The LENGTH of the string is : "+strLen);
	
	
	System.out.println("After REVERSAL : "+strReversal(input));
	
	System.out.println("Checks Equality :");
	checkEquality(input);
	String subStr = input.substring(2);
	String subStr1 = input.substring(2, 4);
	System.out.println("Substring: "+subStr);
	System.out.println("Substring: "+subStr1);
	
	System.out.println("Check Palindrome:" +checkPalindrome(input));
	
}
}
