import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from 'src/model/employee';
import { EmployeeService } from 'src/service/employee.service';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent implements OnInit {

    id!:number;
	employee!:Employee;
	employees!:Employee[];
	constructor(private route: ActivatedRoute, private employeeService: EmployeeService, private router: Router) { }

	ngOnInit(): void {
		this.id = this.route.snapshot.params['id'];
		this.employee = new Employee();
		this.employeeService.getEmployeeById(this.id).subscribe(
			data => {
				this.employee = data;
			});
	}
	updateEmployee(id: number)
	{
		this.router.navigate(['update-employee', id]);
	}
	private getEmployees() {
		this.employeeService.getEmployeesList().subscribe(data => {
			this.employees = data;
		});
	}
	deleteEmployee(id: number) {
		this.employeeService.deleteEmployee(id).subscribe(data => {
			console.log(data);
			alert("Deleted Successfully!!!");
			this.getEmployees();
			this.goToEmployeeList();
		});
	}
	goToEmployeeList() {
		this.router.navigate(['employees']);
	}

}
