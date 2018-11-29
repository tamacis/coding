import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { UserListComponent } from './user-list/user-list.component';
import { UserCreateComponent } from './user-create/user-create.component';
import { UsersComponent } from './users/users.component';
import { UserComponent } from './user.component';


// const routes: Routes = [
	
// 	{path: 'user/users', component: UserListComponent },
//   	{path: 'user/create', component: UserCreateComponent },
//   	{path: 'user/edit/:id', component: UserCreateComponent }
// ];
const userRoutes: Routes = [
  {
    path: '',
    component: UserComponent,
    // canActivate: [AuthGuard],
    children: [
      {
        path: '',
        // canActivateChild: [AuthGuard],
        children: [
          { path: 'users', component: UserListComponent },
          { path: 'create', component: UserCreateComponent },
          { path: 'edit/:id', component: UserCreateComponent },
          { path: '', component: UsersComponent }
        ]
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(userRoutes)],
  exports: [RouterModule]
})
export class UserRoutingModule { }
