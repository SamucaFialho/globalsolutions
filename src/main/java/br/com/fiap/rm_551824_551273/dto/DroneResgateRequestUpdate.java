package br.com.fiap.rm_551824_551273.dto;

import br.com.fiap.rm_551824_551273.model.DroneResgate;

public class DroneResgateRequestUpdate {


    private Long id;
    private String modelo;
    private Long valor;

    public DroneResgate toModel(DroneResgate drone){
        drone.setModelo(this.modelo);
        drone.setValor(this.valor);
        return drone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        this.valor = valor;
    }

}
