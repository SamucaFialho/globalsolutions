package br.com.fiap.rm_551824_551273.globalsolution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.rm_551824_551273.globalsolution.model.DroneResgate;

@Repository
public interface DroneResgateRepository extends JpaRepository<DroneResgate, Long>{
}
