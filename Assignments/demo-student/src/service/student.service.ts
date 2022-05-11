import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Student } from '../model/student';
//import { Student } from 'src/model/student';

@Injectable()
export class StudentService {

  private studentUrl : string;
  
  private baseUrl : string = "http://localhost:8080/";

  constructor(private http: HttpClient) {
    this.studentUrl = 'http://localhost:8080/AllStudents'
   }

   public findAll(): Observable<Student[]>{
     return this.http.get<Student[]>(this.studentUrl);
   }
   
   public addStudent(student:Student): Observable<any> {
    const headers = { 'content-type': 'application/json'}  
    const body=JSON.stringify(student);
    console.log(body)
    return this.http.post(this.baseUrl + 'AddStudent', body,{'headers':headers})
  }
 
   
}