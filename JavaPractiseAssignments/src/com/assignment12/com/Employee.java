package com.assignment12.com;

import java.util.ArrayList;

public class Employee {
	
public String Name;
public String Designation;
public String Gender;
public String DateOfJoin;
public int Salary;

public Employee(String name,String des,String gender,String date,int salary)
{
this.Name=name;
this.Designation=des;
this.Gender=gender;
this.DateOfJoin=date;
this.Salary=salary;


}


public  int countEmpt(ArrayList<Employee> list)
{
	int count=list.size();
	return count;
}

public  int countMale(Employee Gender)
{
	int count=0;
	if(this.Gender=="Male")
		count+=1;
	
			return count;
		}

public  int countFemale(Employee Gender)
{
	int c=0;
	if(this.Gender=="Female")
	c+=1;
	return c;
	}

}