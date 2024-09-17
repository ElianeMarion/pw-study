package br.com.etechoracio.study.repository;

import br.com.etechoracio.study.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
    Disciplina findByNome(String nome);
}
