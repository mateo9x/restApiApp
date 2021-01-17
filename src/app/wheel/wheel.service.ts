import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class WheelService {
  private baseUrl = 'http://localhost:8080/api/wheel/';

  constructor(private http:HttpClient) { }

  getWheelList(): Observable<any>{
    return this.http.get(`${this.baseUrl}`+ 'showAll');
  }

  createWheel(wheel: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, wheel);
  }

  deleteWheel(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }

  getWheel(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  updateWheel(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

}
