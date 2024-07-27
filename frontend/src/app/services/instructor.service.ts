import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {InstructorDetailDto} from "../dtos/instructor";

@Injectable({
  providedIn: 'root'
})
export class InstructorService {

  private instructorBaseUri: string = 'http://localhost:8080' + "/instructor";

  constructor(private httpClient: HttpClient) {
  }

  getInstructorById(id: number): Observable<InstructorDetailDto> {
    return this.httpClient.get<InstructorDetailDto>(this.instructorBaseUri + '/' + id);
  }

  getAllInstructors(): Observable<InstructorDetailDto[]> {
    return this.httpClient.get<InstructorDetailDto[]>(this.instructorBaseUri);
  }

  updateInstructors(instructors: InstructorDetailDto[]): Observable<InstructorDetailDto[]> {
    return this.httpClient.put<InstructorDetailDto[]>(this.instructorBaseUri, instructors);
  }
}
