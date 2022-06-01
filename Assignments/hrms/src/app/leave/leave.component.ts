import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Leave } from 'src/model/leave';
import { EmployeeService } from 'src/service/employee.service';

@Component({
  selector: 'app-leave',
  templateUrl: './leave.component.html',
  styleUrls: ['./leave.component.css']
})
export class LeaveComponent implements OnInit {
   
  leaves!: Leave[];
  constructor(private employeeService: EmployeeService, private router: Router) { }

  ngOnInit(): void {
	this.getLeaves();
  }
  
  private getLeaves()
  {
	this.employeeService.getLeavesList().subscribe(data=>{
		this.leaves=data;
	});
}
updateLeave(empId: string) {
		this.router.navigate(['update-leaves', empId]);
	}


}
