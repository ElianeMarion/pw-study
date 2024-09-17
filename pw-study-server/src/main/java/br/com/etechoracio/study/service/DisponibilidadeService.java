package br.com.etechoracio.study.service;

import br.com.etechoracio.study.exceptions.DisponibilidadeNotFoundException;
import br.com.etechoracio.study.model.Disponibilidade;
import br.com.etechoracio.study.model.Monitor;
import br.com.etechoracio.study.repository.DisponibilidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisponibilidadeService {
    
    @Autowired
    private DisponibilidadeRepository disponibilidadeRepository;


    public List<Disponibilidade> buscarTodasDisponibilidades(){
        return disponibilidadeRepository.findAll();
    }

    public Disponibilidade buscarDisponibilidadesPorId(Long id){
        return disponibilidadeRepository.findById(id).orElseThrow(
                ()-> new DisponibilidadeNotFoundException("Disponibilidade não encontrada."));
    }

    public Disponibilidade buscarDisponibilidadesPorMonitor(Monitor monitor){
        return disponibilidadeRepository.findByMonitor(monitor);
    }

    public Disponibilidade cadastrarDisponibilidade(Disponibilidade disponibilidade){
        return disponibilidadeRepository.save(disponibilidade);
    }
}
