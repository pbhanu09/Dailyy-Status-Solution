package com.bhaiti.kela.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bhaiti.kela.beans.Employee;
import com.bhaiti.kela.beans.EmployeeRegistration;

@Controller
@RequestMapping("/method")
public class EmployeeController
{
	// Navigate the user to Post Method
	@GetMapping("getForm")
    public String getForm()
	{
        return "regEmployee";
    }
	
	
	// Input the employee details and add it
	@RequestMapping(method = RequestMethod.POST , value="/registerEmployee")
	public String registerEmployee(Employee employee)
	{
			System.out.println("In register Employee");      
	        EmployeeRegistration.getInstance().add(employee);
	        return "viewDetails";
	}
	
}
