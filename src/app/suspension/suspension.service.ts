import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SuspensionService {

  private baseUrl = 'http://localhost:8080/api/suspension/';

  constructor(private http:HttpClient) { }

  getSuspensionList(): Observable<any>{
    return this.http.get(`${this.baseUrl}`+ 'showAll');
  }

  createSuspension(suspension: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, suspension);
  }

  deleteSuspension(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }

  getSuspension(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  updateSuspension(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

}
