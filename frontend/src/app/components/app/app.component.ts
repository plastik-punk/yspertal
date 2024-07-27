import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router, RouterLink, RouterOutlet} from '@angular/router';
import {NgIf} from "@angular/common";
import {InstructorService} from "../../services/instructor.service";
import {Globals} from "../../global/globals";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, RouterLink, NgIf],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent implements OnInit {
  title = 'frontend';
  currentRoute: string = '';
  name = 'firstname lastname';
  subtitle = 'subtitle';

  isAdmin: boolean = false;

  project: boolean = false;
  login: boolean = true;
  profile: boolean = false;
  tn: boolean = false;
  instructor: boolean = false;

  constructor(private route: ActivatedRoute, private router: Router, private instructorService: InstructorService, private globals: Globals) {
  }

  ngOnInit() {
    this.getCurrentPage();
  }

  getCurrentPage(): void {
    this.router.events.subscribe(() => {
      this.currentRoute = this.router.url;

      this.name = this.globals.name;
      this.isAdmin = this.globals.isAdmin;

      if (this.currentRoute.includes('project')) {
        this.project = true;
      } else {
        this.project = false;
      }

      if (this.currentRoute.includes('tn')) {
        this.tn = true;
      } else {
        this.tn = false;
      }

      if (this.currentRoute.includes('profile')) {
        this.subtitle = 'Profil';
        this.profile = true;
      } else {
        this.profile = false;
      }

      if (this.currentRoute.includes('instructor')) {
        this.instructor = true;
        if (this.currentRoute.includes('create')) {
          this.subtitle = 'Neue:r Referent:in';
        }
      } else {
        this.instructor = false;
      }

      if (this.currentRoute.includes('overview')) {
        this.subtitle = 'Übersicht';
      }

      if (this.currentRoute.includes('login')) {
        this.subtitle = 'Login';
        this.login = true;
      } else {
        this.login = false;
      }

    });
  }

  navigateToProjects() {
    this.router.navigate([this.globals.id + '/project-overview']);
  }

  navigateToTN() {
    this.router.navigate([this.globals.id + '/tn-overview']);
  }

  navigateToProfile() {
    this.router.navigate([this.globals.id + '/profile']);
  }

  navigateToLogin() {
    this.globals.id = -1;
    this.router.navigate(['login']);
  }

  navigateToInstructor() {
    this.router.navigate(['instructor-overview']);
  }
}
