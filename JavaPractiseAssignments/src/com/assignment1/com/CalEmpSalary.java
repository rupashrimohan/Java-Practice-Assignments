package com.assignment1.com;

import java.util.Scanner;

public class CalEmpSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		double Basicpay = scan.nextDouble();
		
		GrossSalary  gross = new GrossSalary();
		double Gross= gross.calGross(Basicpay);
		System.out.println("The Gross Salary of an Employee is "+gross.calGross(Basicpay));
		System.out.println("The NetSalary of an Employee is "+gross.calNet(Gross));
	
	}

}
