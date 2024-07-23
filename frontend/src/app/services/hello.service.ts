import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class HelloService {

  constructor(private httpClient: HttpClient) {}

  getHello(name: string): Observable<string> {
    return this.httpClient.get(`http://localhost:8080/hello?name=${name}`, { responseType: 'text' });
  }
}
