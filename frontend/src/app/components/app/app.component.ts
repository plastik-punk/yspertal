import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router, RouterOutlet} from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent implements OnInit {
  title = 'frontend';
  currentRoute: string = '';
  navHighlight= 0;  // 0 = projects, 1 = tn, 2 = profile
  name = 'Jörg Zwicker';
  subtitle = 'Übersicht';

  constructor(private route: ActivatedRoute, private router: Router) {
    this.router.events.subscribe(() => {
      this.currentRoute = this.router.url;
    });
  }

  ngOnInit() {
    this.currentRoute = this.router.url;
    this.getCurrentName()
    this.getCurrentPage()
    this.getCurrentSubtitle()
  }

  getCurrentName() {

  }

  getCurrentPage(): void {
    if (this.currentRoute.includes('projects')) {
      this.navHighlight = 0;
    }
    else if (this.currentRoute.includes('tn')) {
      this.navHighlight = 1;
    }
    else if (this.currentRoute.includes('profile')) {
      this.navHighlight = 2;
    }
  }

  getCurrentSubtitle() {

  }
}
