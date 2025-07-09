import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { Lista } from './pages/lista/lista';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, Lista],
  templateUrl: './app.html',
  styleUrl: './app.scss'
})
export class App {
  protected title = 'world!';
}
