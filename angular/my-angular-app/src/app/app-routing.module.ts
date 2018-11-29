import {
  NgModule
} from '@angular/core';
import {
  CommonModule
} from '@angular/common';

import {
  Routes,
  RouterModule
} from '@angular/router';

import {DashboardComponent} from './dashboard/dashboard.component';
import {CoursesComponent} from './courses/courses.component';
import {StudentsComponent} from './students/students.component';

const routes: Routes = [
 {path: '', component: DashboardComponent},
 {path: 'dashboard', component: DashboardComponent},
 {path: 'course', component: CoursesComponent},
 {path: 'student', component: StudentsComponent},
 
];

@NgModule({
  imports: [CommonModule, RouterModule.forRoot(routes)],
  exports: [RouterModule],

  declarations: []
})
export class AppRoutingModule {}
