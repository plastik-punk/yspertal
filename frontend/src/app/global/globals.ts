import {Injectable} from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class Globals {
  readonly backendUri: string = this.findBackendUrl();

  public id: number = -1;

  public name: string = "";

  public isAdmin: boolean = false;

  constructor() {
  }

  private findBackendUrl(): string {
    if (typeof window !== 'undefined') {
      if (window.location.port === '4200') { // local `ng serve`, backend at localhost:8080
        return 'http://localhost:8080';
      } else {
        // assume deployed somewhere and backend is available at same host/port as frontend
        return window.location.protocol + '//' + window.location.host + window.location.pathname + 'api/v1';
      }
    } else {
      // Provide a fallback or handle the case when window is not defined
      return 'http://localhost:8080/api/v1';
    }
  }
}


