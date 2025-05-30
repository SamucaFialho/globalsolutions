package br.com.fiap.rm_551824_551273.globalsolution.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.fiap.rm_551824_551273.globalsolution.dto.DroneResgateRequestCreate;
import br.com.fiap.rm_551824_551273.globalsolution.dto.DroneResgateRequestUpdate;
import br.com.fiap.rm_551824_551273.globalsolution.model.DroneResgate;
import br.com.fiap.rm_551824_551273.globalsolution.repository.DroneResgateRepository;

@Service
public class DroneResgateService {


    @Autowired
    DroneResgateRepository droneResgateRepository;


    public DroneResgate create(DroneResgateRequestCreate dto){
        return droneResgateRepository.save(dto.toModel());
    }

    public Optional<DroneResgate> update(Long id, DroneResgateRequestUpdate dto){
        
        return
        droneResgateRepository.findById(id)
        .map(p -> droneResgateRepository.save(dto.toModel(p)));
    }

    public List<DroneResgate> getAll(){
        return droneResgateRepository.findAll();
    }

    public Optional<DroneResgate> getById(Long id){
        return droneResgateRepository.findById(id);
    }

    public boolean deletebyId(Long id){
        if (droneResgateRepository.existsById(id)) {
            droneResgateRepository.deleteById(id);
            return true;

        }
        return false;
        
    }




}
