import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ExhaustService {
  private baseUrl = 'http://localhost:8080/api/exhaust/';

  constructor(private http:HttpClient) { }

  getExhaustList(): Observable<any>{
    return this.http.get(`${this.baseUrl}`+ 'showAll');
  }

  createExhaust(exhaust: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, exhaust);
  }

  deleteExhaust(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }

  getExhaust(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  updateExhaust(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }
}
