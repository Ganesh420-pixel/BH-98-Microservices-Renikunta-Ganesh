package com.ganesh.main.Service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ganesh.main.Entity.Employee;
import com.ganesh.main.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	 
	@Autowired
	private EmployeeRepository empRep;

	public Employee save(Employee employee) {
		// TODO Auto-generated method stub
		Random random = new Random();
		String empId = String.valueOf(random.nextInt(10000));
		employee.setEmId(empId);
		return empRep.save(employee) ;
	}

	
}
