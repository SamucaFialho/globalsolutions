package br.com.fiap.rm_551824_551273.globalsolution.dto;

import br.com.fiap.rm_551824_551273.globalsolution.model.DroneResgate;

public class DroneResgateResponse {


    private Long id;
    private String modelo;
    private Long valor;
    private int bateria;
    
    public DroneResgateResponse toDto(DroneResgate drone){
        this.setId(drone.getId());
        this.setModelo(drone.getModelo());
        this.setBateria(drone.getBateria());
        this.setValor(drone.getValor());
        return this;
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
    public int getBateria() {
        return bateria;
    }
    public void setBateria(int bateria) {
        this.bateria = bateria;
    }


}
