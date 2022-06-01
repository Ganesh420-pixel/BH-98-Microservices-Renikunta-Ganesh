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
import com.ganesh.main.Entity.LeaveManage;
import com.ganesh.main.Repository.EmployeeRepository;
import com.ganesh.main.Repository.LeaveRepository;
import com.ganesh.main.Service.EmployeeService;
import com.ganesh.main.Service.LeaveService;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
/**
 * 
 * @author renikunta_ganesh
 *
 */
public class EmpController {
	@Autowired
	private EmployeeRepository empRep;
    
	@Autowired
	private LeaveService leaveService;
	

	@Autowired
	private LeaveRepository leaveRep;
	
	@Autowired
	private EmployeeService empService;
	
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
		return empService.save(employee);
		
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
	public LeaveManage save(@RequestBody LeaveManage leave)
	{
		return leaveService.save(leave);
		
	}
	
	@GetMapping("/leave")
	public List<LeaveManage> getAllLeaves()
	{
	  return leaveRep.findAll();
	}
	
	@GetMapping("/leave/{empId}")
	LeaveManage getOneLeave(@PathVariable String empId)
	{
		return leaveRep.findByEmpId(empId);
	}
	
	@PutMapping("/leave/{empId}")
	public LeaveManage leaveUpadate(@RequestBody LeaveManage lev, @PathVariable String empId)
	{
		LeaveManage leaveManage =  leaveRep.findByEmpId(empId);
		leaveManage.setEmpId(lev.getEmpId());
		leaveManage.setEname(lev.getEname());
		leaveManage.setEdepartment(lev.getEdepartment());
		leaveManage.setReportTo(lev.getReportTo());
		leaveManage.setApprover(lev.getApprover());
		leaveManage.setStartDate(lev.getStartDate());
		leaveManage.setEndDate(lev.getEndDate());
		leaveManage.setNoOfDays(lev.getNoOfDays());
		leaveManage.setApprovalDate(lev.getApprovalDate());
		leaveManage.setStatus(lev.getStatus());
		return leaveRep.save(leaveManage);
		
		/* return  leaveRep.queryfindByEmpId(empId).map(
				leaveManage ->{
					leaveManage.setId(lev.getId());
					leaveManage.setEname(lev.getEname());
					leaveManage.setEdepartment(lev.getEdepartment());
					leaveManage.setReportTo(lev.getReportTo());
					leaveManage.setApprover(lev.getApprover());
					leaveManage.setStartDate(lev.getStartDate());
					leaveManage.setEndDate(lev.getEndDate());
					leaveManage.setNoOfDays(lev.getNoOfDays());
					leaveManage.setApprovalDate(lev.getApprovalDate());
					leaveManage.setStatus(lev.getStatus());
					return leaveRep.save(leave);
				}).orElseGet(() -> {
					lev.setId(empId);
					return leaveRep.save(lev);
				});*/
				
	}
	
}
