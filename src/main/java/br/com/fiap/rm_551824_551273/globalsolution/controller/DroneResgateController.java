package br.com.fiap.rm_551824_551273.globalsolution.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import br.com.fiap.rm_551824_551273.globalsolution.dto.DroneResgateRequestCreate;
import br.com.fiap.rm_551824_551273.globalsolution.dto.DroneResgateRequestUpdate;
import br.com.fiap.rm_551824_551273.globalsolution.dto.DroneResgateResponse;
import br.com.fiap.rm_551824_551273.globalsolution.model.DroneResgate;
import br.com.fiap.rm_551824_551273.globalsolution.service.DroneResgateService;

@RestController
@RequestMapping("/droneresgate")
public class DroneResgateController {

    @Autowired
    private DroneResgateService droneResgateService;

    @PostMapping
    public ResponseEntity<DroneResgateResponse> createDrone(@RequestBody DroneResgateRequestCreate dto){
        return ResponseEntity.status(201).body(new DroneResgateResponse()
        .toDto(droneResgateService.create(dto)));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DroneResgateResponse> findDroneById(@PathVariable Long id){
        return droneResgateService.getById(id)
        .map(p -> new DroneResgateResponse().toDto(p))
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.noContent().build());
    }

    @GetMapping
    public ResponseEntity <List<DroneResgateResponse>> findAllDrone(){
        return ResponseEntity.ok(droneResgateService.getAll().stream()
        .map(p -> new DroneResgateResponse().toDto(p))
        .collect(Collectors.toList()));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DroneResgateResponse> updateDrone(@PathVariable Long id,
                                                            @RequestBody DroneResgateRequestUpdate dto){
        return droneResgateService.update(id, dto)
        .map(p -> new DroneResgateResponse().toDto(p))
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDrone(@PathVariable Long id){
        boolean deletado = droneResgateService.deletebyId(id);

        if (deletado) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }


}
