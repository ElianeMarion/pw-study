package br.com.etechoracio.study.repository;

import br.com.etechoracio.study.model.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonitorRepository extends JpaRepository<Monitor, Long> {
}
