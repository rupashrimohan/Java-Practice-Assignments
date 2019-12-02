package com.assignment3.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMethods {

	
	public Integer findMin(ArrayList<Integer> list)
	{
		ArrayList<Integer> sortedList = new ArrayList<Integer>(list);
		
		Collections.sort(list);
		
		return sortedList.get(0);
		
	}
	public Integer findMax(ArrayList<Integer> list)
	{
ArrayList<Integer> sortedList = new ArrayList<Integer>(list);
		
		Collections.sort(list);
		return sortedList.get(sortedList.size()-1);
		
	}
	public Integer findSum(ArrayList<Integer> list) {
		int sum=0;
		for(int each:list)
		{
			sum=sum+each;
		}
		return sum;
		
	}
	
	public Double findAvg(ArrayList<Integer> list)
	{
		int sum=0;
		for(int each:list)
		{
			sum=sum+each;
		}
		double avg = sum/(list.size());
		return avg;

	}
}
