import { Component, Input } from '@angular/core';
import { Monitor } from 'src/app/model/monitor';
import { ConexaoService } from 'src/app/service/conexao.service';

@Component({
  selector: 'app-monitor',
  templateUrl: './monitor.component.html',
  styleUrls: ['./monitor.component.css']
})
export class MonitorComponent {

  @Input() data: any = '';
  
  whatsappIcon: string = "./assets/imagens/icons/whatsapp.svg";

  constructor(private service: ConexaoService) {
    
  }

  onConectar(monitor : Monitor) {
    
  }

}
