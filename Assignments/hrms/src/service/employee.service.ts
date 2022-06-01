import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Employee } from 'src/model/employee';
import { Leave } from 'src/model/leave';

@Injectable({
	providedIn: 'root'
})
export class EmployeeService {
	private baseURL = "http://localhost:8080/employees";
	private baseURL1 = "http://localhost:8080/leave";
	constructor(private httpClient: HttpClient) { }
	getEmployeesList(): Observable<Employee[]> {
		return this.httpClient.get<Employee[]>(`${this.baseURL}`);
	}
	createEmployee(employee: Employee): Observable<Object> {
		return this.httpClient.post(`${this.baseURL}`, employee);
	}
	deleteEmployee(id: number): Observable<Object> {
		return this.httpClient.delete(`${this.baseURL}/${id}`);
	}
	getEmployeeById(id: number): Observable<Employee>{
		return this.httpClient.get<Employee>(`${this.baseURL}/${id}`);
	}
	updateEmployee(id: number, employee: Employee): Observable<Object>{
		return this.httpClient.put(`${this.baseURL}/${id}`, employee);
	}
	getLeavesList(): Observable<Leave[]> {
		return this.httpClient.get<Leave[]>(`${this.baseURL1}`);
	}
	getleavesByOne(empId: string): Observable<Leave>{
		return this.httpClient.get<Leave>(`${this.baseURL1}/${empId}`);
	}
	updateLeave(leave: Leave, empId: string): Observable<Object>{
		return this.httpClient.put(`${this.baseURL1}/${empId}`, leave);
	}
	
}