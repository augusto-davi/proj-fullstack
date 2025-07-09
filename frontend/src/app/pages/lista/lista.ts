// src/app/pages/lista/lista.ts
import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Dados } from '../../services/dados';

@Component({
  selector: 'app-lista',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './lista.html',
  styleUrls: ['./lista.scss']
})
export class Lista implements OnInit {
  dadosLista: any[] = [];

  constructor(private dadosService: Dados) {}

  ngOnInit() {
    this.dadosService.listarDados().subscribe((res) => {
      this.dadosLista = res;
    });
  }
}

