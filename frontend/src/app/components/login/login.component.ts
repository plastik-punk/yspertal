import {Component} from '@angular/core';
import {FormsModule} from "@angular/forms";
import {Router} from "@angular/router";
import {InstructorService} from "../../services/instructor.service";
import {LoginService} from "../../services/login.service";
import {InstructorLoginDto} from "../../dtos/instructor";
import {Globals} from "../../global/globals";

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [
    FormsModule
  ],
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss'
})
export class LoginComponent {
  instructor: InstructorLoginDto = {
    firstName: '',
    lastName: ''
  }

  constructor(private loginService: LoginService, private router: Router, private globals: Globals, private instructorService: InstructorService) {
  }

  login() {
    this.loginService.login(this.instructor).subscribe({
      next: (data) => {
        this.globals.id = data.id;
        this.globals.name = data.firstName + ' ' + data.lastName;
        this.globals.isAdmin = data.isAdmin;
        this.router.navigate([data.id + '/project-overview']);
      },
      error: (error) => {
        console.error(error);
      }
    });
  }

}
