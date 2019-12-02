package com.assignment5.com;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		
	Scanner scan =  new Scanner(System.in);
	
	System.out.println("Enter the number to find if it Armstrong");
	int num = scan.nextInt();
	int res = 0;
	
	int count =0;
	while(num!=0)
	{
		num/=10;
		++count;
	}
	System.out.println("count" +count);
	
	while(num!=0)
	{
		int last_digit= num%10;
		res = (int) (res + Math.pow(last_digit, count));
	    num = num /10;
	}
		
	if(res==num)
	{
		System.out.println("The Entered number is an ARMSTRONG number");
	}
		
	else
		System.out.println("It is not an ARMSTRONG number");
		
	}
}
