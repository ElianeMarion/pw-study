package br.com.etechoracio.study.repository;

import br.com.etechoracio.study.model.Disponibilidade;
import br.com.etechoracio.study.model.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisponibilidadeRepository extends JpaRepository<Disponibilidade, Long> {
    Disponibilidade findByMonitor(Monitor monitor);
}
