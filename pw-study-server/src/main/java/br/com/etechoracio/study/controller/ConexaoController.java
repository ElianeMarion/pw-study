package br.com.etechoracio.study.controller;

import br.com.etechoracio.study.model.Conexao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/conexoes")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ConexaoController {

    private List<Conexao> conexoes = List.of(new Conexao(), new Conexao(), new Conexao());

    @GetMapping("/count")
    public Long contar() {
        log.info(" > Contagem de conexoes realizadas");
        return (long) conexoes.size();
    }

    @PostMapping
    public ResponseEntity<Conexao> conectar(@RequestBody Conexao conexao) {
        log.info("Conectar com -> {}", conexao);
        conexao.setData(LocalDateTime.now());
        conexoes = new ArrayList<>(conexoes);
        conexoes.add(conexao);
        return ResponseEntity.ok(conexao);
    }

}
