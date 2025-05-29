package br.com.fiap.rm_551824_551273.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DroneResgate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String modelo;
    private int bateria;
    private Long valor;
    private String status;


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
    public int getBateria() {
        return bateria;
    }
    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
    public Long getValor() {
        return valor;
    }
    public void setValor(Long valor) {
        this.valor = valor;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    

}
