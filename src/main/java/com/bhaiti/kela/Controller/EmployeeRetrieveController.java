package com.bhaiti.kela.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bhaiti.kela.beans.Employee;
import com.bhaiti.kela.beans.EmployeeRegistration;


@Controller
public class EmployeeRetrieveController {

	
	// Get the list of employee details
	@RequestMapping(method = RequestMethod.GET, value="/employee/allemployees")
	  @ResponseBody
	  public List<Employee> getAllEmployees() {
	  return EmployeeRegistration.getInstance().getemployeeRecords();
	  }
}
