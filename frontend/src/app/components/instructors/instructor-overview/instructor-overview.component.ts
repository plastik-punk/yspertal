import {Component, OnInit} from '@angular/core';
import {InstructorDetailDto} from "../../../dtos/instructor";
import {InstructorService} from "../../../services/instructor.service";
import {Router} from "@angular/router";
import {NgForOf} from "@angular/common";
import {FormsModule} from "@angular/forms";

@Component({
  selector: 'app-instructor-overview',
  standalone: true,
  imports: [
    NgForOf,
    FormsModule
  ],
  templateUrl: './instructor-overview.component.html',
  styleUrl: './instructor-overview.component.scss'
})
export class InstructorOverviewComponent implements OnInit {

  protected instructors: InstructorDetailDto[] = [];

  edit: boolean = false;

  constructor(private router: Router, private instructorService: InstructorService) {
  }

  ngOnInit() {
    this.getInstructors();
    this.edit = false;
  }

  getInstructors(): void {
    this.instructorService.getAllInstructors().subscribe({
      next: (data) => {
        this.instructors = data;
      },
      error: (error) => {
        console.error(error);
      }
    });
  }

  save() {
    this.edit = false;
    this.instructorService.updateInstructors(this.instructors).subscribe({
      next: (data) => {
        this.instructors = data;
      },
      error: (error) => {
        console.error(error);
      }
    });
  }

  newInstructor() {
    this.router.navigate(['instructor-create']);
  }

}
