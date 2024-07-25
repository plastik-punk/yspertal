import { Routes } from '@angular/router';
import {ProjectOverviewComponent} from "./components/projects/project-overview/project-overview.component";
import {TnOverviewComponent} from "./components/attendees/tn-overview/tn-overview.component";
import {ProfileComponent} from "./components/profile/profile.component";

export const routes: Routes = [
  {path: '', redirectTo: 'project-overview', pathMatch: 'full'},
  {path: 'project-overview', component: ProjectOverviewComponent},
  {path: 'tn-overview', component: TnOverviewComponent},
  {path: 'profile', component: ProfileComponent}
];
