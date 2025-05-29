package br.com.fiap.rm_551824_551273.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.rm_551824_551273.dto.DroneResgateRequestCreate;
import br.com.fiap.rm_551824_551273.dto.DroneResgateResponse;
import br.com.fiap.rm_551824_551273.model.DroneResgate;
import br.com.fiap.rm_551824_551273.service.DroneResgateService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/droneresgate")
public class DroneResgateController {

    DroneResgateService droneResgateService;

    @PostMapping
    public ResponseEntity<DroneResgateResponse> createDrone(@RequestBody DroneResgateRequestCreate dto){
        return ResponseEntity.status(201).body(new DroneResgateResponse()
        .toDto(droneResgateService.create(dto)));
    }

    @GetMapping("{/id}")
    public ResponseEntity<DroneResgateResponse> findDroneById(@PathVariable Long id){
        droneResgateService.getById(id)
        .map(p -> new DroneResgateResponse().toDto(droneResgateService.getById(id)))
    }


}
