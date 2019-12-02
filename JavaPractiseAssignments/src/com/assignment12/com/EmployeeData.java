package com.assignment12.com;

import java.util.ArrayList;

public class EmployeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee("John","Manager","Male","09/11/2012",35000);
		Employee emp2 = new Employee("Alicia","Ass.Manager","Female","02/12/2019",30000);
		Employee emp3 = new Employee("Mary","ProjectManager","Female","06/30/2009",15000);
		Employee emp4 = new Employee("Paul","Clerk","Male","12/12/2011",3000);
		Employee emp5 = new Employee("Andrea","QA","Male","01/14/2018",9000);
		Employee emp6 = new Employee("Greg","Recptionist","Male","02/12/2011",5000);
    	Employee emp7 = new Employee("John","Developer","Female","06/11/2010",45000);

		ArrayList<Employee> list = new ArrayList<Employee>();
		
	list.add(emp1);
	list.add(emp2);
	list.add(emp3);
	list.add(emp4);
	list.add(emp5);
	list.add(emp6);
	list.add(emp7);
	
	int count=emp1.countEmpt(list);
	System.out.println("No.Of.Employees "+count);
	
	
	
	
	
	
	}

}
