package com.ganesh.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ganesh.main.Entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

      //  Employee findByEmp_id(Long emp_id);

}
