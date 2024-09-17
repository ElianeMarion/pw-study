package br.com.etechoracio.study.controller;

import br.com.etechoracio.study.model.Disciplina;
import br.com.etechoracio.study.service.DisciplinaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/disciplinas")
@CrossOrigin(origins = "*", maxAge = 3600)
public class DisciplinaController {

    @Autowired
    private DisciplinaService disciplinaService;

   // private List<Disciplina> disciplinas = buildDisciplinas();


    @GetMapping
    public List<Disciplina> findAll() {
        log.info(" > Consulta de todas as disciplinas");
        return disciplinaService.buscarTodasDisciplinas();

       // return disciplinas;
    }

    @GetMapping("/{id}")
    public Disciplina findById(@PathVariable Long id){
        log.info(" > Consulta de disciplina por id = " + id);
        return disciplinaService.buscarDisciplinasPorId(id);
    }
    @GetMapping("/nome/{nome}")
    public Disciplina findByNome(@PathVariable String nome){
        log.info(" > Consulta de disciplina por nome = " + nome);
        return disciplinaService.buscarDisciplinasPorNome(nome);
    }

    @PostMapping
    public ResponseEntity<Disciplina> cadastrarDisciplina(@RequestBody Disciplina disciplina){
        return ResponseEntity.status(HttpStatus.CREATED).body(disciplinaService.cadastrarDisciplina(disciplina));
    }


    private List<Disciplina> buildDisciplinas() {
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
        return disciplinas;
    }

}
