package br.com.etechoracio.study.service;

import br.com.etechoracio.study.exceptions.DisciplinaNotFoundException;
import br.com.etechoracio.study.model.Disciplina;
import br.com.etechoracio.study.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    public List<Disciplina> buscarTodasDisciplinas(){
        return disciplinaRepository.findAll();
    }

    public Disciplina buscarDisciplinasPorId(Long id){
        return disciplinaRepository.findById(id).orElseThrow(
                ()-> new DisciplinaNotFoundException("Disciplina não encontrada."));
    }

    public Disciplina buscarDisciplinasPorNome(String nome){
        return disciplinaRepository.findByNome(nome);
    }

    public Disciplina cadastrarDisciplina(Disciplina disciplina){
        return disciplinaRepository.save(disciplina);
    }

}
