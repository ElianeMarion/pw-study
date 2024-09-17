package br.com.etechoracio.study.controller;

import br.com.etechoracio.study.enums.DiaSemanaEnum;
import br.com.etechoracio.study.model.Disciplina;
import br.com.etechoracio.study.model.Monitor;
import br.com.etechoracio.study.service.MonitorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/monitores")
@CrossOrigin(origins = "*", maxAge = 3600)
public class MonitorController {

    @Autowired
    private MonitorService monitorService;
    private List<Monitor> tutores = buildTutores();


    @GetMapping
    public List<Monitor> findBy(@RequestParam(value = "id-materia", required = false) Long idMateria,
                                @RequestParam(value = "dia-semana", required = false) DiaSemanaEnum diaSemana,
                                @RequestParam(value = "horario", required = false) LocalTime horario) {
        log.info(" > Consulta de monitores -> {} - {} - {}", idMateria, diaSemana, horario);
        return tutores;
    }

    @PostMapping
    public ResponseEntity<Monitor> inserir(@RequestBody Monitor monitor) {
        log.info("Inserção de monitor: {}", monitor);

        //monitor.setId((long) tutores.size() + 1);
        monitor.setDisciplina(buildDisciplina(monitor.getDisciplina().getId()));
        //tutores.add(monitor);
        monitor = monitorService.cadastrarMonitor(monitor);
        return ResponseEntity.ok(monitor);
    }

    private List<Monitor> buildTutores() {
        List<Monitor> lista = new ArrayList<>();
        Monitor t1 = Monitor.builder().id(1L)
                                .nome("João Silva")
                .email("joao.silva@gmail.com")
                .foto("https://images.generated.photos/qyv1m0SngEh8NvyGe3joHrPfaLezH1Pi3OS0LYL92BE/rs:fit:256:256/czM6Ly9pY29uczgu/Z3Bob3Rvcy1wcm9k/LnBob3Rvcy92M18w/MTQyNDQ1LmpwZw.jpg")
                .whatsApp("+5511912345678")
                .disciplina(Disciplina.builder().nome("Português").build())
                .conteudo("Licenciado em Letras pela Universidade de São Paulo e possui mestrado em Literatura Brasileira pela mesma instituição. Com 15 anos de experiência no ensino de Português, ele se especializa em gramática, redação e interpretação de textos. Além de lecionar, João é autor de diversos artigos acadêmicos e coautor de livros didáticos. Sua paixão pela língua portuguesa o impulsiona a buscar métodos inovadores de ensino. Atualmente, João é professor em uma das escolas mais renomadas de São Paulo.")
                      .build();

        Monitor t2 = Monitor.builder().id(2L)
                .nome("Ana Souza")
                .email("ana.souza@gmail.com")
                .foto("https://images.generated.photos/HQ55UY7QtoJom9mPvPDI1oBW8yAcHefFmi8hT0rGV30/rs:fit:256:256/czM6Ly9pY29uczgu/Z3Bob3Rvcy1wcm9k/LnBob3Rvcy92M18w/NjY3MzgwLmpwZw.jpg")
                .whatsApp("+5511912345689")
                .disciplina(Disciplina.builder().nome("Matemática").build())
                .conteudo("Formada em Matemática pela Universidade Federal de Minas Gerais e possui doutorado em Matemática Pura pela Universidade de Cambridge. Com mais de 20 anos de experiência no ensino de Matemática, Ana é conhecida por sua abordagem prática e teórica. Ela já participou de diversos congressos internacionais e publicou artigos em revistas especializadas. Ana também atua como consultora em projetos educacionais que visam melhorar o ensino de Matemática no Brasil. Atualmente, ela leciona em uma escola de excelência em Belo Horizonte.")
                .build();

        Monitor t3 = Monitor.builder().id(3L)
                .nome("Carlos Mendes")
                .email("carlos.mendes@gmail.com")
                .foto("https://images.generated.photos/AnTe87TxwIU5S1SjERtdfDaOn-A6zV_LAC8-7aAtEMM/rs:fit:256:256/czM6Ly9pY29uczgu/Z3Bob3Rvcy1wcm9k/LnBob3Rvcy92M18w/NDQ0NjQzLmpwZw.jpg")
                .whatsApp("+5511912345790")
                .disciplina(Disciplina.builder().nome("Biologia").build())
                .conteudo("Biólogo formado pela Universidade de Brasília, com mestrado e doutorado em Genética pela Universidade de São Paulo. Ele tem mais de 18 anos de experiência no ensino de Biologia, com foco em genética e ecologia. Carlos é autor de vários livros didáticos e artigos científicos. Além de seu trabalho em sala de aula, ele coordena projetos de pesquisa em genética de populações. Atualmente, Carlos é professor em uma escola de referência em Brasília e também atua como orientador de alunos de pós-graduação.")
                .build();

        lista.add(t1);
        lista.add(t2);
        lista.add(t3);
        return lista;
    }


    private Disciplina buildDisciplina(Long id) {
        Disciplina d1 = Disciplina.builder().id(1L)
                .nome("Biologia")
                .build();

        Disciplina d2 = Disciplina.builder().id(2L)
                .nome("Ciências")
                .build();

        Disciplina d3 = Disciplina.builder().id(3L)
                .nome("Física")
                .build();

        List<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(d1);
        disciplinas.add(d2);
        disciplinas.add(d3);

        return disciplinas.stream().filter(e -> e.getId().equals(id)).findFirst().orElseThrow();
    }

}
