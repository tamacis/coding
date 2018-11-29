import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { HighlightDirective } from './highlight.directive';
import { TitleComponent } from './title.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { CourseModule } from './course/course.module';
import { StudentModule } from './student/student.module';
import { UserModule } from './user/user.module';
import { HttpModule } from '@angular/http';


@NgModule({
  declarations: [
    AppComponent,
    HighlightDirective,
    TitleComponent,
    DashboardComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    CourseModule,
    StudentModule,
    UserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
