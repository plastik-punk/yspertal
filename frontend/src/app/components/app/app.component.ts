import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router, RouterLink, RouterOutlet} from '@angular/router';
import {NgIf} from "@angular/common";

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
  navHighlight= 0;  // 0 = projects, 1 = tn, 2 = profile
  name = 'Jörg Zwicker';
  subtitle = 'Übersicht';
  projectButton: boolean = false;

  constructor(private route: ActivatedRoute, private router: Router) {
  }

  ngOnInit() {
    this.getCurrentName()
    this.getCurrentPage()
    this.getCurrentSubtitle()
  }

  getCurrentName() {

  }

  getCurrentPage(): void {
    this.router.events.subscribe(() => {
      this.currentRoute = this.router.url;
      if (this.currentRoute.includes('project')) {
        this.navHighlight = 0;
        this.projectButton = true;
      }
      else if (this.currentRoute.includes('tn')) {
        this.navHighlight = 1;
        this.projectButton = false;
      }
      else if (this.currentRoute.includes('profile')) {
        this.navHighlight = 2;
        this.projectButton = false;
      }
    });
  }

  getCurrentSubtitle() {

  }

  navigateToProjects() {
    this.router.navigate(['project-overview']);
  }

  navigateToTN() {
    this.router.navigate(['tn-overview']);
  }

  navigateToProfile() {
    this.router.navigate(['profile']);
  }
}
