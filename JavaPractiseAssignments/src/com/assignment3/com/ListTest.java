package com.assignment3.com;

import java.util.ArrayList;
import java.util.Scanner;

public class ListTest {
	public static void main(String[] args) {
		
		System.out.println("Enter the number of items in the list");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter the items in the List");
		for (int i=0;i<num;i++)
		{
			list.add(scan1.nextInt());
			
		}
		
		ListMethods listCompute = new ListMethods();
		int list_SUM=listCompute.findSum(list);
		System.out.println("Sum:"+list_SUM);
		int list_MAX=listCompute.findMax(list);
		System.out.println("Sum:"+list_MAX);
		int list_MIN=listCompute.findMin(list);
		System.out.println("Sum:"+list_MIN);
		double list_AVG=listCompute.findAvg(list);
		System.out.println("Sum:"+list_AVG);
		
		
		
		
		
		
		
		
	}
}
