package com.ganesh.main.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ganesh.main.Entity.Employee;
import com.ganesh.main.Entity.LeaveManage;

@Repository
public interface LeaveRepository extends JpaRepository<LeaveManage, Long> {


	

	LeaveManage findByEmpId(String empId);



}
