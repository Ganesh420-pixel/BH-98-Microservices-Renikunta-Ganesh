import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { StudentListComponent } from './student-list/student-list/student-list.component';
//import { UserListComponent } from './user-list/user-list.component';

const routes: Routes = [
  { path: 'AllStudents', component: StudentListComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }