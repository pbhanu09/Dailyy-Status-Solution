package com.bhaiti.kela.beans;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRegistration 
{
	 private List<Employee> employeeRecords;
	 private static EmployeeRegistration empregd = null;
	    
	 
	 private EmployeeRegistration()
	 {
	   	employeeRecords = new ArrayList<Employee>();
	 }
	    
	 public static EmployeeRegistration getInstance()
	 {
	     if(empregd == null)
	     {
	         empregd = new EmployeeRegistration();
	         return empregd;
	     }
	     else
	     {
	        return empregd;
	     }
	 }
	   
	 // Post the employee details
	 public void add(Employee emp)
	 {
		 employeeRecords.add(emp);
		 
	 }
		
	 // Get the employee details
	 public List<Employee> getemployeeRecords()
	 {
	    return employeeRecords;
	 }
	
}
