package com.ganesh.main.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ganesh.main.Entity.Employee;
import com.ganesh.main.Entity.Leave;
import com.ganesh.main.Repository.EmployeeRepository;
import com.ganesh.main.Repository.LeaveRepository;
import com.ganesh.main.Service.LeaveService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class EmpController {
	@Autowired
	private EmployeeRepository empRep;
    
	@Autowired
	private LeaveService leaveService;
	

	@Autowired
	private LeaveRepository leaveRep;
	
	
	@GetMapping("/employees")
	List<Employee> getAll()
	{
		return empRep.findAll();
	}
	
	@GetMapping("/employees/{id}")
	Optional<Employee> getOne(@PathVariable Long id)
	{
		return empRep.findById(id);
	}
	
	@PostMapping("/employees")
	public Employee save(@RequestBody Employee employee)
	{
		return empRep.save(employee);
		
	}
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable Long id)
	{
		empRep.deleteById(id);
	}
	
	@PutMapping("/employees/{id}")
	Employee updateEmployee(@RequestBody Employee emp,@PathVariable Long id)
	{
		return empRep.findById(id).map(
				employee ->{
					employee.setName(emp.getName());
					employee.setEmail(emp.getEmail());
					employee.setAddress(emp.getAddress());
					employee.setDepartment(emp.getDepartment());
					employee.setContactNo(emp.getContactNo());
					employee.setJoiningDate(emp.getJoiningDate());
					return empRep.save(employee);
				}).orElseGet(() -> {
					emp.setId(id);
					return empRep.save(emp);
				});
	
	}
	
	@PostMapping("/leave")
	public Leave save(@RequestBody Leave leave)
	{
		return leaveService.save(leave);
		
	}
	
	@PutMapping("/leave/{empid}")
	public Leave leaveUpadate(@RequestBody Leave lev, @PathVariable Long empId)
	{
		
		return  leaveRep.findById(empId).map(
				leave ->{
					leave.setId(lev.getId());
					leave.setName(lev.getName());
					leave.setDepartment(lev.getDepartment());
					leave.setReportTo(lev.getReportTo());
					leave.setApprover(lev.getApprover());
					leave.setStartDate(lev.getStartDate());
					leave.setEndDate(lev.getEndDate());
					leave.setNoOfDays(lev.getNoOfDays());
					leave.setApprovalDate(lev.getApprovalDate());
					leave.setStatus(lev.getStatus());
					return leaveRep.save(leave);
				}).orElseGet(() -> {
					lev.setId(empId);
					return leaveRep.save(lev);
				});
				
	}
	
}
