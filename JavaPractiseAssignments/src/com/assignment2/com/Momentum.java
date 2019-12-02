package com.assignment2.com;

import java.util.Scanner;

public class Momentum {
	
   public static void main(String[] args) {
	   System.out.println("Enter the mass in pounds");
	   Scanner scan1=new Scanner(System.in);
	   double pounds = scan1.nextDouble();
	   
	   double mass_kg= pounds * 0.454;
	   
	   System.out.println("Enter the veloity in miles");
	   Scanner scan2= new Scanner(System.in);
	   double miles = scan2.nextDouble();
	   
	   double velocity = miles*1609.344;
	   
	   double momentum = (mass_kg*(Math.pow(velocity, 2)));
	   System.out.println("Momentum: "+momentum);
	   
	   
	   
	   
}

}
