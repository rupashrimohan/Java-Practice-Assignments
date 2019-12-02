package com.assignment7.com;

import java.util.Scanner;

public class Operations {
	
	public static void chooseOperation(String action,int num)
	{	
    switch(action)
    {
    case "SQROOT":
    	double squareroot=Math.sqrt(num);
    	System.out.println( "The squareroot of a number is: "+squareroot);
    	break;
    	
    case "SQUARE":
    	int sq = (int) Math.pow(num, 2);
    	System.out.println("The square of a number is: "+sq);
    	break;
    	
    case "CUBE":
    	int cube = (int) Math.pow(num, 3);
    	System.out.println("The cube of a number is: "+cube);
    	break;
    
    case "PRIME":
    	for(int i=2;i<=num/2;++i)
    	{
    		if(num%i==0)
    		{
    			System.out.println("It is a prime number");
    		}
    		else
    			System.out.println("It is not a prime number");
    	}
    	
    case "FACTORIAL":
    	int i,fact=1;
    	for(i=1;i<=num;i++)
    	{
    		fact=fact*i;
    	}
    	System.out.println("The factorial of "+num+"is: "+fact);
    }
    
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=scan.nextInt();
		
		System.out.println("Type the operation to perform\nSQROOT\nSQUARE\nCUBE\nPRIME\nFACTORIAL\n ");
		Scanner sc = new Scanner(System.in);
		String action= sc.nextLine();
		chooseOperation(action,num);
	}
    	
}
