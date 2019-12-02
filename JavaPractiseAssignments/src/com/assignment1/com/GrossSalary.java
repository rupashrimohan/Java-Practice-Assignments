package com.assignment1.com;

public class GrossSalary {

	public double HRA;
	public double TA;
	public double Gross;
	
	public double calGross(double Basicpay)
	{
		HRA = (10*Basicpay)/100;
		TA = (5*Basicpay)/100;
		
		Gross = Basicpay+ HRA +TA;
		return Gross;
		
	}
	
	public double calNet(double Gross)
	{
		double Emptax;
		Emptax = (2*Gross)/100;
		double NetSalary = Gross-Emptax;
		return NetSalary;
	}
}
