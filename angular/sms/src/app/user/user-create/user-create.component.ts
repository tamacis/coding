import {Component, OnDestroy, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from "@angular/forms";
import {UserService} from "../user.service";
import {User} from "../user";
import {ActivatedRoute, Router} from '@angular/router';
 
 
@Component({
  selector: 'app-user-create',
  templateUrl: './user-create.component.html',
  styleUrls: ['./user-create.component.css'],
  providers: [UserService]
})
export class UserCreateComponent implements OnInit, OnDestroy {
 
  id: number;
  user: User;
 
  userForm: FormGroup;
  private sub: any;
 
  constructor(private route: ActivatedRoute,
              private router: Router,
              private userService: UserService) { }
 
  ngOnInit() {
 	 this.sub = this.route.params.subscribe(params => {
      this.id = params['id'];
    });

    this.userForm = new FormGroup({
      name: new FormControl('', Validators.required),
      age: new FormControl('', Validators.required),
      salary: new FormControl('', Validators.required)
    });
 
 if (this.id) { //edit form
      this.userService.findById(this.id).subscribe(
        user => {
            this.id = user.id;
            this.userForm.patchValue({
            name: user.name,
            age: user.age,
            salary: user.salary,
          });
         },error => {
          console.log(error);
         }
      );
 
    }

  }
 
  ngOnDestroy(): void {
  	this.sub.unsubscribe();
  }
 
  onSubmit() {
    if (this.userForm.valid) {
 if (this.id) {
        let user: User = new User(this.id,
        this.userForm.controls['name'].value,
        this.userForm.controls['age'].value,
        this.userForm.controls['salary'].value);
        this.userService.updateUser(user).subscribe();
 
     } else {
     	let user: User = new User(null,
        this.userForm.controls['name'].value,
        this.userForm.controls['age'].value,
        this.userForm.controls['salary'].value);
        this.userService.saveUser(user).subscribe();
 
     }
      this.userForm.reset();
      this.router.navigate(['/user']);
  }
  else {
  	this.userForm.reset();
      this.router.navigate(['/user/create']);
  }
 }

  redirectUserPage() {
    this.router.navigate(['/user']);
 
  }
}
