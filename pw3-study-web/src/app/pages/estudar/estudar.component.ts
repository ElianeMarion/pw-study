import { Component } from '@angular/core';

@Component({
  selector: 'app-estudar',
  templateUrl: './estudar.component.html',
  styleUrls: ['./estudar.component.css']
})
export class EstudarComponent {

  monitores = [{ id: 1, "foto": "https://images.generated.photos/-t6chrwY4d4Ro2AXJ8fY0jv6NsX7rbGyejtYzHRF704/rs:fit:512:512/wm:0.95:sowe:18:18:0.33/czM6Ly9pY29uczgu/Z3Bob3Rvcy1wcm9k/LnBob3Rvcy92M18w/NDM4Njk0LmpwZw.jpg", "biografia": "Licenciado em Letras pela Universidade de São Paulo e possui mestrado em Literatura Brasileira pela mesma instituição. Com 15 anos de experiência no ensino de Português, ele se especializa em gramática, redação e interpretação de textos. Além de lecionar, João é autor de diversos artigos acadêmicos e coautor de livros didáticos. Sua paixão pela língua portuguesa o impulsiona a buscar métodos inovadores de ensino. Atualmente, João é professor em uma das escolas mais renomadas de São Paulo.", "email": "ana.souza@gmail.com", "nome": "Ana Souza", "disciplina": {"nome": "Português"}, "whatsapp": "+5511971137628" },
               { id: 2, "foto": "https://images.generated.photos/i6niea3KzCXKtAe7I1HujD7aUMH_bn_8iE6t5Ovj5lM/rs:fit:256:256/czM6Ly9pY29uczgu/Z3Bob3Rvcy1wcm9k/LnBob3Rvcy92M18w/NjE0MzU0LmpwZw.jpg", "biografia": "Formada em Matemática pela Universidade Federal de Minas Gerais e possui doutorado em Matemática Pura pela Universidade de Cambridge. Com mais de 20 anos de experiência no ensino de Matemática, Ana é conhecida por sua abordagem prática e teórica. Ela já participou de diversos congressos internacionais e publicou artigos em revistas especializadas. Ana também atua como consultora em projetos educacionais que visam melhorar o ensino de Matemática no Brasil. Atualmente, ela leciona em uma escola de excelência em Belo Horizonte.", "email": "joao.silva@gmail.com", "nome": "João Silva", "disciplina": {"nome": "Matemática"}, "whatsapp": "+5511971137322" }];

  disciplinas: any[] = [{ "value" : 1, "label" : "Artes" },
                        { "value" : 2, "label" : "Biologia" },
                        { "value" : 3, "label" : "Ciências" },
                        { "value" : 4, "label" : "Educação física" },
                        { "value" : 5, "label" : "Física" },
                        { "value" : 6, "label" : "Geografia" },
                        { "value" : 7, "label" : "História" },
                        { "value" : 8, "label" : "Matemática" },
                        { "value" : 9, "label" : "Português" },
                        { "value" : 10, "label" : "Química" }];


}
