import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {InstructorDetailDto, InstructorLoginDto} from "../dtos/instructor";

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  private loginBaseUri: string = 'http://localhost:8080' + "/login";

  constructor(
    private httpClient: HttpClient
  ) {
  }

  login(instructorCreateDto: InstructorLoginDto): Observable<InstructorDetailDto> {
    return this.httpClient.post<InstructorDetailDto>(this.loginBaseUri, instructorCreateDto);
  }
}
