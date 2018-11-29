import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { CoursesComponent } from './course/courses/courses.component';
// import { CourseModule } from './course/course.module';
import { StudentsComponent } from './student/students/students.component';
import { UserComponent } from './user/user.component';


const routes: Routes = [
	{ path: '', redirectTo: 'dashboard', pathMatch: 'full'},
	{ path: 'dashboard', component: DashboardComponent },
  { path: 'course', component: CoursesComponent },
  { path: 'student', component: StudentsComponent },
  // { path: 'user', component: UserComponent },
  {
    path: 'user',
    loadChildren: 'app/user/user.module#UserModule',
  },
];

@NgModule({
	imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ]
 // exports: [ DashboardComponent ]
})
export class AppRoutingModule { }
