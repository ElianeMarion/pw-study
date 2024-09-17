package br.com.etechoracio.study.service;

import br.com.etechoracio.study.model.Monitor;
import br.com.etechoracio.study.repository.MonitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonitorService {

    @Autowired
    private MonitorRepository monitorRepository;

    public List<Monitor> getAll(){
        return monitorRepository.findAll();
    }

    public Monitor buscarPorId(Long id){
        return monitorRepository.findById(id).get();
    }

    public Monitor cadastrarMonitor(Monitor monitor){
        var monitorEncontrado = buscarPorId(monitor.getId());
        if(monitorEncontrado == null){
            monitor = monitorRepository.save(monitor);
        }
//        else {
//            tutor.setWhatsApp(tutorEncontrado.getWhatsApp());
//        }
        return monitor;
    }
}
