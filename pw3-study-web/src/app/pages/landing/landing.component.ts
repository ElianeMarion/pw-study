import { Component } from '@angular/core';
import { ConexaoService } from 'src/app/service/conexao.service';

@Component({
  selector: 'app-landing',
  templateUrl: './landing.component.html',
  styleUrls: ['./landing.component.css']
})
export class LandingComponent {
  
  conexoes : number = 1;

  constructor(private conexaoService: ConexaoService) {

  }

}
