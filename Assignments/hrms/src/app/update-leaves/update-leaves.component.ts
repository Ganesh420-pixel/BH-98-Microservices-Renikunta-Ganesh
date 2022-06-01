import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Leave } from 'src/model/leave';
import { EmployeeService } from 'src/service/employee.service';

@Component({
  selector: 'app-update-leaves',
  templateUrl: './update-leaves.component.html',
  styleUrls: ['./update-leaves.component.css']
})
export class UpdateLeavesComponent implements OnInit {
  
  empId!: string;
  leave: Leave =new Leave();
  constructor(private employeeService: EmployeeService, private route: ActivatedRoute, private router: Router) { }

  ngOnInit(): void {
	this.empId = this.route.snapshot.params['empId'];
	this.employeeService.getleavesByOne(this.empId).subscribe(
			data => {
				this.leave = data;
			});
  }
  
  OnSubmit()
	{
		this.employeeService.updateLeave(this.leave, this.empId,).subscribe(data =>{
			this.goToLeaves();
		});
	}
	goToLeaves()
	{
		this.router.navigate(['/leave']);
	}

}
