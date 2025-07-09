import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({ providedIn: 'root' })
export class Dados {
  private apiUrl = 'http://localhost:8080/api/dados';

  constructor(private http: HttpClient){}

  listarDados(): Observable<any[]>{
    return this.http.get<any[]>(this.apiUrl);
  }
}
