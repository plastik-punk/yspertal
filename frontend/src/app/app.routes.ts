import { Routes } from '@angular/router';
import {HelloComponent} from "./components/hello/hello.component";

export const routes: Routes = [
  {path: '', redirectTo: 'hello', pathMatch: 'full'},
  {path: 'hello', component: HelloComponent}
];
