import {Routes} from '@angular/router';
import {ProjectOverviewComponent} from "./components/projects/project-overview/project-overview.component";
import {TnOverviewComponent} from "./components/attendees/tn-overview/tn-overview.component";
import {LoginComponent} from "./components/login/login.component";
import {InstructorComponent} from "./components/instructors/instructor/instructor.component";
import {InstructorOverviewComponent} from "./components/instructors/instructor-overview/instructor-overview.component";
import {InstructorCreateComponent} from "./components/instructors/instructor-create/instructor-create.component";

export const routes: Routes = [
  {path: '', redirectTo: 'login', pathMatch: 'full'},
  {path: ':id/project-overview', component: ProjectOverviewComponent},
  {path: ':id/tn-overview', component: TnOverviewComponent},
  {path: ':id/profile', component: InstructorComponent},
  {path: 'login', component: LoginComponent},
  {path: 'instructor-overview', component: InstructorOverviewComponent},
  {path: 'instructor-create', component: InstructorCreateComponent}
];
