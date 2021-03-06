import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateEmployeeComponent } from './create-employee/create-employee.component';
import { EmployeeDetailsComponent } from './employee-details/employee-details.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { LeaveComponent } from './leave/leave.component';
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';
import { UpdateLeavesComponent } from './update-leaves/update-leaves.component';

const routes: Routes = [
	{path: 'employees', component: EmployeeListComponent},
	{path: 'create-employee', component: CreateEmployeeComponent},
	{path: 'employee-details/:id', component: EmployeeDetailsComponent},
	{path: 'update-employee/:id', component: UpdateEmployeeComponent},
	{path: 'leave', component: LeaveComponent},
	{path: 'update-leaves/:empId', component: UpdateLeavesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
