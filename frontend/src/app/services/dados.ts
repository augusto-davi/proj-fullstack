import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Dado{
  id: string;
  nome: string;
}

@Injectable({ providedIn: 'root' })
export class Dados {
  private readonly apiUrl = 'http://localhost:8080/api/dados';

  constructor(private http: HttpClient){}

  listar(): Observable<Dado[]>{
    return this.http.get<Dado[]>(this.apiUrl);
  }

  adicionar(dado: Dado): Observable<void>{
    return this.http.post<void>(this.apiUrl, dado);
  }

  atualizar(dado: Dado): Observable<void>{
    return this.http.put<void>(this.apiUrl, dado);
  }

  remover(id: string): Observable<void>{
    return this.http.delete<void>(`${this.apiUrl}/${id}`);
  }
}
