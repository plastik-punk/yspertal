import {Injectable} from '@angular/core';
import {Globals} from "../global/globals";
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable, tap} from "rxjs";
import {InstructorCreateDto, InstructorDetailDto} from "../dtos/instructor";

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  private loginBaseUri: string = 'http://localhost:8080' + "/login";

  constructor(
    private httpClient: HttpClient
  ) {
  }

  login(instructorCreateDto: InstructorCreateDto): Observable<InstructorDetailDto> {
    return this.httpClient.post<InstructorDetailDto>(this.loginBaseUri, instructorCreateDto);
  }
}
