import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CourseRoutingModule } from './course-routing.module';
import { CoursesComponent } from './courses/courses.component';
import { CourseListComponent } from './course-list/course-list.component';
import { CourseCreateComponent } from './course-create/course-create.component';

@NgModule({
  imports: [
    CommonModule,
    CourseRoutingModule
  ],
  declarations: [
  CoursesComponent, 
  CourseListComponent, 
  CourseCreateComponent
  ],
  
  providers: [],
  bootstrap: [CoursesComponent]
})
export class CourseModule { }
