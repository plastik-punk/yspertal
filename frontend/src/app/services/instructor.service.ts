import { Injectable } from '@angular/core';
import {HttpClient, HttpParams} from "@angular/common/http";
import {Globals} from "../global/globals";
import {Observable} from "rxjs";
import {InstructorDetailDto} from "../dtos/instructor";

@Injectable({
  providedIn: 'root'
})
export class InstructorService {

  private instructorBaseUri: string = 'http://localhost:8080' + "/instructor";

  constructor(private httpClient: HttpClient) { }

  getInstructorById(id: number): Observable<InstructorDetailDto> {
    return this.httpClient.get<InstructorDetailDto>(this.instructorBaseUri + '/' + id);
  }
}
